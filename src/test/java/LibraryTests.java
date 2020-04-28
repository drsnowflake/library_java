import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTests {

    Library library;
    Book book1;
    Book book2;
    Book book3;
    Borrower borrower;

    @Before
    public void before(){
        library = new Library();
        book1 = new Book("Off to be the Wizard", "Scott Meyer", "Fiction");
        book2 = new Book("Vox Machina Origins", "Matthew Mercer","Fiction");
        book3 = new Book("Permanent Record", "Edward Snowden", "Non-Fiction");
        borrower = new Borrower("Rob");
    }

    @Test
    public void checkCollectionStartsEmpty(){
        assertEquals(0,library.getBooks());
    }

    @Test
    public void canAddToCollection() {
        library.addToCollection(book1);
        library.addToCollection(book2);
        library.addToCollection(book3);
        assertEquals(3, library.getBooks());
    }

    @Test
    public void cantAddToCollection(){
        library.addToCollection(book1);
        library.addToCollection(book2);
        library.addToCollection(book3);
        library.addToCollection(book1);
        library.addToCollection(book2);
        library.addToCollection(book3);
        assertEquals(5, library.getBooks());
    }

    @Test
    public void canBorrowBook(){
        library.addToCollection(book1);
        library.addToCollection(book2);
        library.addToCollection(book3);
        library.loanBook(book1, borrower);
        assertEquals(2, library.getBooks());
        assertEquals(1, borrower.getBooks());
    }
}
