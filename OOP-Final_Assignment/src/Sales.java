import java.util.ArrayList;
import java.util.List;

public class Sales {
    private List<Book> salesHistory;

    public Sales() {
        this.salesHistory = new ArrayList<>();
    }

    public void addSale(Book book) {
        salesHistory.add(book);
    }

    public void displaySalesHistory() {
        for (Book book : salesHistory) {
            System.out.println(book);
        }
    }
}
