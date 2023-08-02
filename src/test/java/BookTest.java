import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    private Book book;

    @Before
    public void before(){
        book = new Book("Catch-22", "Joseph Heller", "Fiction");
    }

    @Test
    public void shouldHaveTitle(){
        assertEquals("Catch-22", book.getTitle());
    }

    @Test
    public void shouldHaveAuthor(){
        assertEquals("Joseph Heller", book.getAuthor());
    }

    @Test
    public void shouldHaveGenre(){
        assertEquals("Fiction", book.getGenre());
    }
}
