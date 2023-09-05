package oop11.visitor.book;

public interface Book {
    void accept(Visitor v);
}
