
class Book extends Product {
    private String author;

    public Book(int productID, String title, String author, double price, int quantity) {
        super(productID, title, price, quantity);
        this.author = author;
    }

    // Getters and setters for author
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
