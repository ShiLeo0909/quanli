package author2_3;

import java.util.Arrays;

public class Book {
    private String isbn;
    private String name;
    private Author author;
    private double price;
    private int qty=0;

    public Book(String isbn , String name , Author author , double price , int qty){
        this.isbn = isbn;
        this.name = name ;
        this.author = author ;
        this.price = price;
        this.qty = qty;
    }
    public Book(String isbn , String name , Author author , double price ){
        this.isbn = isbn;
        this.name = name ;
        this.author = author ;
        this.price = price;
    }

    public Author getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getQty() {
        return qty;
    }

    public double getPrice() {
        return price;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }


    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", name=" + name +
                ", author=" + author +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }
}
