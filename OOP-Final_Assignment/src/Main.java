import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BookstoreManagementSystem system = new BookstoreManagementSystem();
        system.loadInventory();
        system.loadSalesHistory();

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
                    // Add new book to inventory
                    System.out.print("Enter Book ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter Price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter Quantity: ");
                    int quantity = scanner.nextInt();
                    system.inventory.addBook(new Book(id, title, author, price, quantity));
                    break;
                case 2:
                    // Update book quantity
                    System.out.print("Enter Book ID: ");
                    int bookID = scanner.nextInt();
                    System.out.print("Enter New Quantity: ");
                    int newQuantity = scanner.nextInt();
                    system.inventory.updateQuantity(bookID, newQuantity);
                    break;
                case 3:
                    // Display available books
                    system.inventory.displayBooks();
                    break;
                case 4:
                    // Process sale
                    System.out.print("Enter Book ID: ");
                    int saleBookID = scanner.nextInt();
                    System.out.print("Enter Quantity Sold: ");
                    int saleQuantity = scanner.nextInt();
                    system.processSale(saleBookID, saleQuantity);
                    break;
                case 5:
                    // Display sales history
                    system.sales.displaySalesHistory();
                    break;
                case 6:
                    // Exit
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
