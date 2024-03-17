import java.io.*;
import java.util.Scanner;


public class BookstoreManagementSystem {
    private static final String INVENTORY_FILE = "inventory.csv";
    private static final String SALES_FILE = "sales.csv";
    private static final String CUSTOMER_FILE = "customers.csv";

    private Inventory inventory;
    private Sales sales;
    private Customer customer;

    public BookstoreManagementSystem() {
        this.inventory = new Inventory();
        this.sales = new Sales();
        this.customer = new Customer();
    }

    public void loadInventory() {
        try (BufferedReader reader = new BufferedReader(new FileReader(INVENTORY_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                int productID = Integer.parseInt(data[0]);
                String title = data[1];
                String author = data[2];
                double price = Double.parseDouble(data[3]);
                int quantity = Integer.parseInt(data[4]);
                inventory.addBook(new Book(productID, title, author, price, quantity));
            }
        } catch (IOException e) {
            System.out.println("Error loading inventory: " + e.getMessage());
        }
    }

    public void saveInventory() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(INVENTORY_FILE))) {
            for (Book book : inventory.getBooks()) {
                writer.println(book.getProductID() + "," + book.getTitle() + "," + book.getAuthor() + "," + book.getPrice() + "," + book.getQuantity());
            }
        } catch (IOException e) {
            System.out.println("Error saving inventory: " + e.getMessage());
        }
    }

    public void loadSalesHistory() {
        try (BufferedReader reader = new BufferedReader(new FileReader(SALES_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                int productID = Integer.parseInt(data[0]);
                String title = data[1];
                String author = data[2];
                double price = Double.parseDouble(data[3]);
                int quantity = Integer.parseInt(data[4]);
                sales.addSale(new Book(productID, title, author, price, quantity));
            }
        } catch (IOException e) {
            System.out.println("Error loading sales history: " + e.getMessage());
        }
    }

    public void saveSalesHistory() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(SALES_FILE))) {
            for (Book sale : sales.getSalesHistory()) {
                writer.println(sale.getProductID() + "," + sale.getTitle() + "," + sale.getAuthor() + "," + sale.getPrice() + "," + sale.getQuantity());
            }
        } catch (IOException e) {
            System.out.println("Error saving sales history: " + e.getMessage());
        }
    }

    public void saveCustomerInfo() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(CUSTOMER_FILE))) {
            writer.println(customer.getCustomerID() + "," + customer.getName() + "," + customer.getEmail());
        } catch (IOException e) {
            System.out.println("Error saving customer information: " + e.getMessage());
        }
    }

    public void loadCustomerInfo() {
        try (BufferedReader reader = new BufferedReader(new FileReader(CUSTOMER_FILE))) {
            String line;
            if ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                int customerID = Integer.parseInt(data[0]);
                String name = data[1];
                String email = data[2];
                customer.setCustomerID(customerID);
                customer.setName(name);
                customer.setEmail(email);
            }
        } catch (IOException e) {
            System.out.println("Error loading customer information: " + e.getMessage());
        }
    }

    public void processSale(int productID, int quantity) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Customer ID: ");
        int customerID = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Customer Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Customer Email: ");
        String email = scanner.nextLine();
        customer.setCustomerID(customerID);
        customer.setName(name);
        customer.setEmail(email);

        Book soldBook = null;
        for (Book book : inventory.getBooks()) {
            if (book.getProductID() == productID) {
                soldBook = book;
                int remainingQuantity = book.getQuantity() - quantity;
                if (remainingQuantity < 0) {
                    System.out.println("Not enough quantity in inventory.");
                    return;
                }
                book.setQuantity(remainingQuantity);
                break;
            }
        }
        if (soldBook != null) {
            soldBook.setQuantity(quantity);
            sales.addSale(soldBook);
            System.out.println("Sale processed successfully.");
        } else {
            System.out.println("Book with ID " + productID + " not found in inventory.");
        }
        scanner.close();
    }

    // Getters and setters for Inventory
    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    // Getters and setters for Sales
    public Sales getSales() {
        return sales;
    }

    public void setSales(Sales sales) {
        this.sales = sales;
    }

    // Getters and setters for Customer
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
