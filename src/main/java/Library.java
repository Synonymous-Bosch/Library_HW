import java.util.ArrayList;
import java.util.HashMap;

public class Library {
    private ArrayList<Book> collection;
    private int capacity;
    private HashMap<String, Integer> booksByGenre;

    public Library(int capacity){
        this.capacity = capacity;
        this.collection = new ArrayList<>();
        this.booksByGenre = new HashMap<>();
    }

    public int checkCapacity() {
        return capacity;
    }

    public int countBooks() {
        return collection.size();
    }

    public void addBook(Book book) {
        if (capacity > countBooks()) {
            collection.add(book);
            booksByGenre.merge(book.getGenre(), 1, Integer::sum);
        }
    }

    public void removeBook(Book book) {
        collection.remove(book);
        booksByGenre.merge(book.getGenre(), -1, Integer::sum);
    }

    public void checkOutBook(Borrower borrower, Book book) {
        removeBook(book);
        borrower.addBook(book);
    }

    public int countBooksByGenre(String genre) {
        return booksByGenre.get(genre.toLowerCase());
    }
}
