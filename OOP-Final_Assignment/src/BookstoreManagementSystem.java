import java.io.*;
import java.util.Scanner;



public class BookstoreManagementSystem {
    private static final String INVENTORY_FILE = "inventory.csv";
    private static final String SALES_FILE = "sales.csv";

    protected Inventory inventory;
    protected Sales sales;


    public BookstoreManagementSystem() {
        this.inventory = new Inventory();
        this.sales = new Sales();
    }

    public void loadInventory() {
        try (BufferedReader reader = new BufferedReader(new FileReader(INVENTORY_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                int bookID = Integer.parseInt(data[0]);
                String title = data[1];
                String author = data[2];
                double price = Double.parseDouble(data[3]);
                int quantity = Integer.parseInt(data[4]);
                inventory.addBook(new Book(bookID, title, author, price, quantity));
            }
        } catch (IOException e) {
            System.out.println("Error loading inventory: " + e.getMessage());
        }
    }

    public void saveInventory() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(INVENTORY_FILE))) {
            for (Book book : inventory.getBooks()) {
                writer.println(book.getBookID() + "," + book.getTitle() + "," + book.getAuthor() + "," + book.getPrice() + "," + book.getQuantity());
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
                int bookID = Integer.parseInt(data[0]);
                String title = data[1];
                String author = data[2];
                double price = Double.parseDouble(data[3]);
                int quantity = Integer.parseInt(data[4]);
                sales.addSale(new Book(bookID, title, author, price, quantity));
            }
        } catch (IOException e) {
            System.out.println("Error loading sales history: " + e.getMessage());
        }
    }

    public void saveSalesHistory() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(SALES_FILE))) {
            for (Book sale : sales.getSalesHistory()) {
                writer.println(sale.getBookID() + "," + sale.getTitle() + "," + sale.getAuthor() + "," + sale.getPrice() + "," + sale.getQuantity());
            }
        } catch (IOException e) {
            System.out.println("Error saving sales history: " + e.getMessage());
        }
    }

    public void processSale(int bookID, int quantity) {
        Book soldBook = null;
        for (Book book : inventory.getBooks()) {
            if (book.getBookID() == bookID) {
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
            soldBook.setQuantity(quantity); // Adjusting quantity for sales history
            sales.addSale(soldBook);
            System.out.println("Sale processed successfully.");
        } else {
            System.out.println("Book with ID " + bookID + " not found in inventory.");
        }
    }

}