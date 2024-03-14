import java.util.*;



public class Book {

    private int bookID;
    private String title;
    private String author;
    private double price;
    private int quantity;

    public Book(int bookID, String title, String author, double price, int quantity) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    public int getBookID() {
        return bookID;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "ID: " + bookID + "\nTitle: " + title + "\nAuthor: " + author + "\nPrice: $" + price + "\nQuantity: " + quantity;
    }

}
