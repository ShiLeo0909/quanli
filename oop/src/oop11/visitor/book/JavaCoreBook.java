package oop11.visitor.book;

public class JavaCoreBook implements ProgramingBook{
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public String getResource() {
        return null;
    }
    public String getFavouriteBook() {
        return "The most favourite book of java core";
    }
}
