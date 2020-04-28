import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Book> collection;
    private int capacity;
    private HashMap<String, Integer> bookGenres;

    public Library() {
        this.collection = new ArrayList<Book>();
        this.capacity = 5;
        this.bookGenres = new HashMap<String, Integer>();
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

    public void countBooksByGenre() {
        for (int i = 0; i < getBooks(); i++) {
            String genre = this.collection.get(i).getGenre();
            if (this.bookGenres.containsKey(genre)) {
                int value = bookGenres.get(genre);
                this.bookGenres.remove(genre);
                this.bookGenres.put(genre, (value + 1));
            } else {
                this.bookGenres.put(genre, 1);
            }
        }
    }

    public HashMap<String, Integer> getBookGenres() {
        return this.bookGenres;
    }

}
