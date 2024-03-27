package BookStore;
import java.util.Scanner;

// Main class executes the whole program in command line
public class Main {
    public static void main(String[] args) {
        //instantiating BookStoreManagementSystenm
        BookstoreManagementSystem system = new BookstoreManagementSystem();
        system.loadInventory();
        system.loadSalesHistory();
        system.loadCustomerInfo();

        Scanner scanner = new Scanner(System.in); // scanner object to take user input
        int choice;
        // do-while loop used to excuting codeblock once before checking loop condition
        do {
            System.out.println("1. Add new book to inventory");
            System.out.println("2. Update book quantity");
            System.out.println("3. Display available books");
            System.out.println("4. Process sale");
            System.out.println("5. Display sales history");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1: // option to add new book
                    System.out.print("Enter Book ID: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter Price: ");
                    double price = Double.parseDouble(scanner.nextLine());
                    System.out.print("Enter Quantity: ");
                    int quantity = Integer.parseInt(scanner.nextLine());
                    system.getInventory().addBook(new Book(id, title, author, price, quantity));
                    break;
                case 2: // option to update quantity
                    System.out.print("Enter Book ID: ");
                    int bookID = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter New Quantity: ");
                    int newQuantity = Integer.parseInt(scanner.nextLine());
                    system.getInventory().updateQuantity(bookID, newQuantity);
                    break;
                case 3: // option to display booklist
                    system.getInventory().displayBooks();
                    break;
                case 4: // option to process sale
                    System.out.print("Enter Book ID: ");
                    int saleBookID = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter Quantity Sold: ");
                    int saleQuantity = Integer.parseInt(scanner.nextLine());
                    system.processSale(saleBookID, saleQuantity); // processing sale and updateing sales history
                    system.saveCustomerInfo(); // saving customer info
                    break;
                case 5:
                    system.getSales().displaySalesHistory(); // print sales history
                    break;
                case 6: // saving and exiting
                    system.saveInventory();
                    system.saveSalesHistory();
                    break;
                default: // invalid input message
                    System.out.println("Invalid choice");
            }
        } while (choice != 6); // loop condition
        scanner.close();
    }
}