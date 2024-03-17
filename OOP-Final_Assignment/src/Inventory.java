import java.util.*;

public class Inventory {
    private ArrayList<Book> books;

    public Inventory() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void updateQuantity(int bookID, int quantity) {
        for (Book book : books) {
            if (book.getBookID() == bookID) {
                book.setQuantity(quantity);
                return;
            }
        }
        System.out.println("Book with ID " + bookID + " not found.");
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println( "\n" + book);
        }
    }

    public List<Book> getBooks() {
        return books;
    }


}
