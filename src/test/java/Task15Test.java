import org.junit.jupiter.api.Test;
import task15.Article;
import task15.Product;
import task15.ProductArticleNameComparator;
import java.util.HashSet;
import java.util.TreeSet;
import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static task15.Task15.*;

class Task15Test {
    @Test
    void addProductToBasket() {
        out.println("Test should add product to basket");

        TreeSet<Product> productsInBasket = new TreeSet<>(new ProductArticleNameComparator());
        productsInBasket.add(new Product(new Article("Dress", 950)));
        productsInBasket.add(new Product(new Article("Jeans", 950.50F)));

        out.println("Before adding product");
        showProducts(productsInBasket);
        Article newArticle = new Article("Sweater", 650);
        Product newProduct = new Product(newArticle);

        TreeSet<Product> actualList = addProductInBasket(productsInBasket, newArticle);
        out.println("After adding product");
        showProducts(actualList);

        assertTrue(actualList.contains(newProduct));
    }

    @Test
    void removeBookFromShelf() {
        out.println("Test should remove product from basket");

        TreeSet<Product> productsInBasket = new TreeSet<>(new ProductArticleNameComparator());
        productsInBasket.add(new Product(new Article("Dress", 950)));
        productsInBasket.add(new Product(new Article("Jeans", 950.50F)));

        out.println("Before removing product");
        showProducts(productsInBasket);
        HashSet<Product> productInBasketHashSet = new HashSet<>(productsInBasket);
        Article articleForRemoving = findByArticleName("Dress", productInBasketHashSet);
        Product productForRemoving = new Product(articleForRemoving);

        TreeSet<Product> actualTreeSet = new TreeSet<>(productsInBasket);
        TreeSet<Product> actualList = removeProductFromBasket(actualTreeSet, articleForRemoving);
        out.println("After removing product");
        showProducts(actualList);

        assertFalse(actualList.contains(productForRemoving));
    }
}
