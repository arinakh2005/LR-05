package task15;
import static java.lang.System.exit;
import static java.lang.System.out;
import static java.lang.Thread.sleep;
import java.util.*;

public class Task15 {
    public static final int MENU_ITEMS = 5;

    public static void main(String[] args) {
        out.println("\nTask 15");
        int chosenMenuItem;

        HashSet<Product> products = new HashSet<>();
        products.add(new Product(new Article("Shirt", 450)));
        products.add(new Product(new Article("Leggings", 835.50F)));
        products.add(new Product(new Article("Pants", 690.99F)));
        products.add(new Product(new Article("Cap", 250), true));
        products.add(new Product(new Article("Jacket", 1290), true));

        TreeSet<Product> productsInUserBasket = new TreeSet<>(new ProductArticleNameComparator());

        do {
            chosenMenuItem = showMenu();
            switch (chosenMenuItem) {
                case 1:
                    showProducts(products);
                    out.println("Please, press 'Enter' to continue...\n");
                    Scanner scanner = new Scanner(System.in);
                    scanner.nextLine();
                    break;
                case 2:
                    showProducts(productsInUserBasket);
                    break;
                case 3:
                    Article newProductInBasket = findByArticleName(inputProductName(), products);
                    if (newProductInBasket != null) addProductInBasket(productsInUserBasket, newProductInBasket);
                    break;
                case 4:
                    Article removeProductFromBasket = findByArticleName(inputProductName(), products);
                    if (removeProductFromBasket != null) removeProductFromBasket(productsInUserBasket, removeProductFromBasket);
                    break;
                case 5:
                    out.println("Program was successfully finished!\n");
                    exit(0);
                    break;
            }
            clearConsole();
        } while (chosenMenuItem != 0);
    }

    public static void showProducts(Collection<Product> products) {
        if (products.isEmpty()) {
            out.println("Empty product list!");
            return;
        }

        out.println("List of products: ");
        out.println("|--------------------------------|");
        System.out.format("|%13s\t|%15s |\n", "Name", "Price");
        out.println("|--------------------------------|");

        for (Product product : products) {
            Article article = product.getArticle();
            System.out.format("|%13s\t|%15s |\n", article.getName(), article.getPrice());
            out.println("|--------------------------------|");
        }
    }

    public static String inputProductName() {
        Scanner scanner = new Scanner(System.in);
        out.println("Please input product name: ");

        return scanner.nextLine();
    }

    public static Article findByArticleName(String name, HashSet<Product> products) {
        for (Product product : products) {
            if (product.getArticle().getName().equals(name)) {
                return product.getArticle();
            }
        }

        out.println("No such product found!");
        return null;
    }

    public static TreeSet<Product> addProductInBasket(TreeSet<Product> productsInBasket, Article productForAddingInBasket) {
        for (Product product : productsInBasket) {
            if (product.getArticle().equals(productForAddingInBasket)) {
                out.printf("Product %s already exist in your basket!\n", productForAddingInBasket.getName());
                break;
            }
        }

        Product newProduct = new Product(productForAddingInBasket);
        productsInBasket.add(newProduct);
        out.println("Product was successfully added to basket!");
        return productsInBasket;
    }

    public static TreeSet<Product> removeProductFromBasket(TreeSet<Product> productsInBasket, Article productForRemoving) {
        for (Product product : productsInBasket) {
            if (product.getArticle().equals(productForRemoving)) {
                productsInBasket.remove(product);
                out.printf("Product %s was successfully removed from your basket!\n", productForRemoving.getName());
                break;
            }
        }

        return productsInBasket;
    }

    public static Integer showMenu() {
        Scanner scanner = new Scanner(System.in);
        int chosenMenuItem = 0;

        do {
            out.println("\nMenu:");
            out.println("1. Show products");
            out.println("2. Show products in basket");
            out.println("3. Add product to basket");
            out.println("4. Remove product from basket");
            out.println("5. Exit\n");
            out.print("Choose menu item (1-5): ");
            try {
                chosenMenuItem =  scanner.nextInt();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (chosenMenuItem < 0 || chosenMenuItem > MENU_ITEMS);

        return chosenMenuItem;
    }

    public static void clearConsole() {
        try {
            sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 50; ++i) out.println();
    }
}
