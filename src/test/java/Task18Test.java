import org.junit.jupiter.api.Test;
import task18.Book;
import java.math.BigInteger;
import java.util.HashSet;
import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static task18.Task18.*;

class Task18Test {
    @Test
    void addBookToShelf() {
        out.println("Test should add book to shelf");

        HashSet<Book> books = new HashSet<>();
        books.add(new Book(new BigInteger("9785234667087"), "Harry Potter", "Rowling J.K.",
                "Bloomsbury", 2019, 210.40F));
        books.add(new Book(new BigInteger("3285234667087"), "Fortress", "Brown Dan",
                "Charles Scribner", 2021, 325.90F));
        books.add(new Book(new BigInteger("9785232227087"), "One Day", "Nicholls David",
                "Bloomsbury", 2020, 480));

        out.println("Before adding book");
        showBooks(books);
        Book newBook = new Book(new BigInteger("9751231257897"), "Odyssey", "Homer",
                "Bloomsbury", 	2020, 260);

        HashSet<Book> actualList = addBook(books, newBook);
        out.println("After adding book");
        showBooks(books);

        assertTrue(actualList.contains(newBook));
    }

    @Test
    void removeBookFromShelf() {
        out.println("Test should remove book from shelf");

        HashSet<Book> books = new HashSet<>();
        books.add(new Book(new BigInteger("9785234667087"), "Harry Potter", "Rowling J.K.",
                "Bloomsbury", 2019, 210.40F));
        books.add(new Book(new BigInteger("3285234667087"), "Digital Fortress", "Brown Dan",
                "Charles Scribner", 2021, 325.90F));
        books.add(new Book(new BigInteger("9785232227087"), "One Day", "Nicholls David",
                "Bloomsbury", 2020, 480));

        out.println("Before removing book");
        showBooks(books);
        Book bookForRemoving = findBookByISBN(new BigInteger("3285234667087"), books);

        HashSet<Book> actualList = removeBook(books, bookForRemoving);
        out.println("After removing student");
        showBooks(actualList);

        assertFalse(actualList.contains(bookForRemoving));
    }
}
