package oop7.ex1_1;

public abstract class Shape {
    protected String  coler= "red";
    protected Boolean filled = true;

    public Shape() {
    }

    public Shape(String coler, Boolean filled) {
        this.coler = coler;
        this.filled = filled;
    }

    public String getColer() {
        return coler;
    }

    public Boolean isFilled() {
        return filled;
    }

    public void setColer(String coler) {
        this.coler = coler;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape[" +
                "coler='" + coler + '\'' +
                ", filled=" + filled +
                ']';
    }
}
