package author2_2;

import java.util.Arrays;

public class Book {
    private String name;
    private Author [] author;
    private double price;
    private int qty = 0;

    public Book(String name,Author[] author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public Book(String name, Author [] author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Author [] getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + Arrays.toString(author) +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(Author [] author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public String getAuthorNames(){
       String str = "";
        for (int i = 0; i < author.length; i++) {
            str += author[i];
        }
        return str;
    }
}

