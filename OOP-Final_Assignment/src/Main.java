import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookstoreManagementSystem system = new BookstoreManagementSystem();
        system.loadInventory();
        system.loadSalesHistory();
        system.loadCustomerInfo();

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Add new book to inventory");
            System.out.println("2. Update book quantity");
            System.out.println("3. Display available books");
            System.out.println("4. Process sale");
            System.out.println("5. Display sales history");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter Price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter Quantity: ");
                    int quantity = scanner.nextInt();
                    system.getInventory().addBook(new Book(id, title, author, price, quantity));
                    break;
                case 2:
                    System.out.print("Enter Book ID: ");
                    int bookID = scanner.nextInt();
                    System.out.print("Enter New Quantity: ");
                    int newQuantity = scanner.nextInt();
                    system.getInventory().updateQuantity(bookID, newQuantity);
                    break;
                case 3:
                    system.getInventory().displayBooks();
                    break;
                case 4:
                    System.out.print("Enter Book ID: ");
                    int saleBookID = scanner.nextInt();
                    System.out.print("Enter Quantity Sold: ");
                    int saleQuantity = scanner.nextInt();
                    system.processSale(saleBookID, saleQuantity);
                    system.saveCustomerInfo();
                    break;
                case 5:
                    system.getSales().displaySalesHistory();
                    break;
                case 6:
                    system.saveInventory();
                    system.saveSalesHistory();
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 6);
        scanner.close();
    }
}