package BookStore;

import java.util.*;


class Inventory {
    private ArrayList<Book> books;

    public Inventory() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void updateQuantity(int productID, int quantity) {
        for (Book book : books) {
            if (book.getProductID() == productID) {
                book.setQuantity(quantity);
                return;
            }
        }
        System.out.println("Book with ID " + productID + " not found.");
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("Inventory is empty.");
            return;
        }

        // Print table header
        System.out.println("---------------------------------------------------------------");
        System.out.printf("| %-8s | %-30s | %-20s | %-8s | %-8s |\n", "Book ID", "Title", "Author", "Price", "Quantity");
        System.out.println("---------------------------------------------------------------");

        // Print each book information
        for (Book book : books) {
            System.out.printf("| %-8d | %-30s | %-20s | %-8.2f | %-8d |\n", book.getProductID(), book.getTitle(), book.getAuthor(), book.getPrice(), book.getQuantity());
        }

        // Print table footer
        System.out.println("---------------------------------------------------------------");
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
}