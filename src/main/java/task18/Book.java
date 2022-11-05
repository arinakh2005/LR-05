package task18;

import java.math.BigInteger;

public class Book {
    private BigInteger ISBN;
    private String name;
    private String authorFullname;
    private String publication;
    private int yearOfPublication;
    private float price;

    public Book(BigInteger ISBN, String name, String authorFullname, String publication, int yearOfPublication, float price) {
        if (!isISBNCorrect(String.valueOf(ISBN))) {
            System.out.println("ISBN doesn't correct!");
            return;
        }
        this.ISBN = ISBN;
        this.name = name;
        this.authorFullname = authorFullname;
        this.publication = publication;
        this.yearOfPublication = yearOfPublication;
        this.price = price;
    }

    public boolean isISBNCorrect(String ISBN) {
        return ISBN.matches("^[0-9]{13}$");
    }

    public String getAuthorFullname() {
        return authorFullname;
    }

    public void setAuthorFullname(String authorFullname) {
        this.authorFullname = authorFullname;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public BigInteger getISBN() {
        return ISBN;
    }

    public void setISBN(BigInteger ISBN) {
        this.ISBN = ISBN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
