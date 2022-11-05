package task18;
import java.math.BigInteger;
import java.util.*;
import static java.lang.System.exit;
import static java.lang.System.out;
import static java.lang.Thread.sleep;

public class Task18 {
    public static final int MENU_ITEMS = 6;

    public static void main(String[] args) {
        out.println("\nTask 18");
        int chosenMenuItem;

        HashSet<Book> books = new HashSet<>();
        books.add(new Book(new BigInteger("9781234567897"), "Don Quixote", "Miguel de Cervantes",
                "De Robles", 2019, 250));
        books.add(new Book(new BigInteger("4781834567697"), "Madame Bovary", "Gustave Flaubert",
                "Charles Scribner", 2019, 375.90F));
        books.add(new Book(new BigInteger("9781627936644"), "War and Peace", "Leo Tolstoy",
                "Start Classics", 2020, 430));
        books.add(new Book(new BigInteger("9781234567897"), "Hamlet", "William Shakespeare",
                "Bloomsbury", 2020, 236.5F));
        books.add(new Book(new BigInteger("9781234567897"), "Odyssey", "Homer",
                "Bloomsbury", 	2022, 220));

        do {
            chosenMenuItem = showMenu();
            switch (chosenMenuItem) {
                case 1:
                    showBooks(books);
                    out.println("Please, press 'Enter' to continue...\n");
                    Scanner scanner = new Scanner(System.in);
                    scanner.nextLine();
                    break;
                case 2:
                    sortBooks(books);
                    break;
                case 3:
                    Book newBook = inputBookInfo();

                    if (findBookByISBN(newBook.getISBN(), books) != null) {
                        out.printf("Book with ISBN %s already exist in shelf!\n", newBook.getISBN());
                        break;
                    }

                    addBook(books, newBook);
                    break;
                case 4:
                    changeBookPrice(books);
                    break;
                case 5:
                    BigInteger ISBN = inputISBN();
                    Book bookForRemoving = findBookByISBN(ISBN, books);

                    if (bookForRemoving != null) removeBook(books, bookForRemoving);

                    break;
                case 6:
                    out.println("Program was successfully finished!\n");
                    exit(0);
                    break;
            }
            clearConsole();
        } while (chosenMenuItem != 0);
    }

    public static void showBooks(Collection<Book> books) {
        if (books.isEmpty()) {
            out.println("Empty book shelf!");
            return;
        }

        out.println("List of books: ");
        out.println("|------------------------------------------------------------------------------------------------------------|");
        System.out.format("|%14s |%15s |%20s | %20s | %20s | %6s|\n",
                "ISBN", "Name", "Author", "Publication", "Year of publication", "Price");
        out.println("|------------------------------------------------------------------------------------------------------------|");

        for (Book book : books) {
            System.out.format("| %12d |%15s |%20s | %20s | %20s | %6s|\n",
                    book.getISBN(), book.getName(), book.getAuthorFullname(),
                    book.getPublication(), book.getYearOfPublication(), book.getPrice());
            out.println("|------------------------------------------------------------------------------------------------------------|");
        }
    }

    public static void sortBooks(HashSet<Book> books) {
        Scanner scanner = new Scanner(System.in);
        out.print("Please, choose sort mode: (1 - by publication, 2 - by price [default]): ");
        int chosenMode = scanner.nextInt();
        scanner.nextLine();

        List<Book> booksList = new ArrayList<>(books);

        if (chosenMode == 1) {
            booksList.sort(new BookPublicationComparator());
        } else {
            booksList.sort(new BookPriceComparator());
        }
        out.println("Shelf was sorted!");
        showBooks(booksList);
    }

    public static BigInteger inputISBN() {
        Scanner scanner = new Scanner(System.in);
        out.println("Please, input book ISBN: ");
        BigInteger ISBN = scanner.nextBigInteger();
        scanner.nextLine();

        return ISBN;
    }

    public static Book inputBookInfo() {
        Scanner scanner = new Scanner(System.in);
        BigInteger ISBN = inputISBN();

        out.println("Please, input book name: ");
        String name = scanner.nextLine();

        out.println("Please, input author fullname: ");
        String author = scanner.nextLine();

        out.println("Please, input publication: ");
        String publication = scanner.nextLine();

        out.println("Please, input year of publication: ");
        int yearOfPublication = scanner.nextInt();
        scanner.nextLine();

        out.println("Please, input book price: ");
        float price = scanner.nextFloat();
        scanner.nextLine();

        return new Book(ISBN, name, author, publication, yearOfPublication, price);
    }

    public static Book findBookByISBN(BigInteger ISBN, HashSet<Book> books) {
        for (Book book : books) {
            if (book.getISBN().equals(ISBN)) {
                return book;
            }
        }

        out.println("Not found book with ISBN " + ISBN);
        return null;
    }

    public static HashSet<Book> addBook(HashSet<Book> books, Book book) {
        books.add(book);
        out.println("Book was successfully added to shelf!");

        return books;
    }

    public static void changeBookPrice(HashSet<Book> books) {
        Scanner scanner = new Scanner(System.in);
        BigInteger ISBN = inputISBN();
        Book foundedBook = findBookByISBN(ISBN, books);

        if (foundedBook == null) return;
        books.remove(foundedBook);

        out.println("Please, input new book price: ");
        float newPrice = scanner.nextFloat();
        scanner.nextLine();

        foundedBook.setPrice(newPrice);
        out.println("Price was successfully changed!");
        books.add(foundedBook);
    }

    public static HashSet<Book> removeBook(HashSet<Book> books, Book bookForRemoving) {
        for (Book book : books) {
            if (book.getISBN().equals(bookForRemoving.getISBN())) {
                books.remove(book);
                out.printf("Book %s was successfully removed from shelf!\n", book.getName());
                break;
            }
        }

        return books;
    }

    public static Integer showMenu() {
        Scanner scanner = new Scanner(System.in);
        int chosenMenuItem = 0;

        do {
            out.println("\nMenu:");
            out.println("1. Show books");
            out.println("2. Sort books");
            out.println("3. Add book to shelf");
            out.println("4. Change book price");
            out.println("5. Remove book from shelf");
            out.println("6. Exit\n");
            out.print("Choose menu item (1-6): ");
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
