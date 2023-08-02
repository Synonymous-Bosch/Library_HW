import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;
    private Borrower borrower;

    @Before
    public void before(){
        library = new Library(3);
        book = new Book("Catch-22", "Joseph Heller", "fiction");
        borrower = new Borrower("Terry");
    }

    @Test
    public void shouldHaveCapacityOf10(){
        assertEquals(3, library.checkCapacity());
    }

    @Test
    public void shouldHaveEmptyCollection(){
        assertEquals(0, library.countBooks());
    }

    @Test
    public void shouldAddBookToCollection(){
        library.addBook(book);
        assertEquals(1, library.countBooks());
    }

    @Test
    public void shouldNotAddBookIfCollectionAtCapacity(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(3, library.countBooks());
    }

    @Test
    public void shouldRemoveBookFromCollection(){
        library.addBook(book);
        library.removeBook(book);
        assertEquals(0, library.countBooks());
    }

    @Test
    public void checkOutBookFromLibraryAndAddToBorrower(){
        library.addBook(book);
        library.checkOutBook(borrower, book);
        assertEquals(0, library.countBooks());
        assertEquals(1, borrower.countBooks());
    }

    @Test
    public void countBooksByGenreTwo(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(3, library.countBooksByGenre("fiction"));
    }
}
