package task15;

import java.util.Comparator;

public class ProductArticleNameComparator implements Comparator<Product> {
    @Override
    public int compare(Product a, Product b) {
        return a.getArticle().getName().compareTo(b.getArticle().getName());
    }
}
