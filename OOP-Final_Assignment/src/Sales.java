import java.util.ArrayList;

class Sales {
    private ArrayList<Book> salesHistory;

    public Sales() {
        this.salesHistory = new ArrayList<>();
    }

    public void addSale(Book book) {
        salesHistory.add(book);
    }

    public void displaySalesHistory() {
        if (salesHistory.isEmpty()) {
            System.out.println("Sales history is empty.");
            return;
        }

        // Print table header
        System.out.println("---------------------------------------------------------------");
        System.out.printf("| %-8s | %-30s | %-20s | %-8s | %-8s |\n", "Book ID", "Title", "Author", "Price", "Quantity");
        System.out.println("---------------------------------------------------------------");

        // Print each sale information
        for (Book sale : salesHistory) {
            System.out.printf("| %-8d | %-30s | %-20s | %-8.2f | %-8d |\n", sale.getProductID(), sale.getTitle(), sale.getAuthor(), sale.getPrice(), sale.getQuantity());
        }

        // Print table footer
        System.out.println("---------------------------------------------------------------");
    }

    public ArrayList<Book> getSalesHistory() {
        return salesHistory;
    }
}