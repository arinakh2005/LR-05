package task18;

import java.util.Comparator;

public class BookISBNComparator implements Comparator<Book> {
    @Override
    public int compare(Book a, Book b) {
        return a.getISBN() == b.getISBN() ? 1 : 0;
    }
}
