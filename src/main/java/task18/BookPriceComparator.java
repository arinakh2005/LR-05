package task18;

import java.util.Comparator;

public class BookPriceComparator implements Comparator<Book> {
    @Override
    public int compare(Book a, Book b) {
        return Float.compare(a.getPrice(), b.getPrice());
    }}
