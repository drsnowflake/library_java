import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> borrowedBooks;

    public Borrower(String name){
        this.name = name;
        this.borrowedBooks =  new ArrayList<Book>();
    }

    public void borrowBook(Book book) {
        this.borrowedBooks.add(book);
    }

    public int getBooks() {
        return this.borrowedBooks.size();
    }
}
