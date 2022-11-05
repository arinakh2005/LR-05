package task18;

import java.util.Comparator;

public class BookPublicationComparator implements Comparator<Book> {
    @Override
    public int compare(Book a, Book b) {
        return a.getPublication().compareTo(b.getPublication());
    }
}
