import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Book book;

    @Before
    public void before(){
        borrower = new Borrower("MacGuffin");
        book = new Book("Catch-22", "Joseph Heller", "Fiction");
    }

    @Test
    public void shouldHaveName(){
        assertEquals("MacGuffin", borrower.getName());
    }

    @Test
    public void shouldHaveEmptyCollection(){
        assertEquals(0, borrower.countBooks());
    }

    @Test
    public void shouldAddBookToCollection(){
        borrower.addBook(book);
        assertEquals(1, borrower.countBooks());
    }
}
