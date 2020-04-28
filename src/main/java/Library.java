import java.util.ArrayList;

public class Library {

    private ArrayList<Book> collection;
    private int capacity;

    public Library() {
        this.collection = new ArrayList<Book>();
        this.capacity = 5;
    }

    public int getBooks() {
        return this.collection.size();
    }

    public void addToCollection(Book book) {
        if (this.capacity > this.getBooks()) {
            this.collection.add(book);
        }
    }

    public void loanBook(Book book, Borrower borrower) {
        this.collection.remove(book);
        borrower.borrowBook(book);
    }

}
