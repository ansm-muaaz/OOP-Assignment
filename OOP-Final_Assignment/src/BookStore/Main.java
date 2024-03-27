package com.oopfinal;
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
            choice = Integer.parseInt(scanner.nextLine());
//            scanner.nextLine(); // consume newline
            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID: ");
                    int id = Integer.parseInt(scanner.nextLine());
//                    scanner.nextLine();
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
                case 2:
                    System.out.print("Enter Book ID: ");
                    int bookID = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter New Quantity: ");
                    int newQuantity = Integer.parseInt(scanner.nextLine());
                    system.getInventory().updateQuantity(bookID, newQuantity);
                    break;
                case 3:
                    system.getInventory().displayBooks();
                    break;
                case 4:
                    System.out.print("Enter Book ID: ");
                    int saleBookID = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter Quantity Sold: ");
                    int saleQuantity = Integer.parseInt(scanner.nextLine());
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