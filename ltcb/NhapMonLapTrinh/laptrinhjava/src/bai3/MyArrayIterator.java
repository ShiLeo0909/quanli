package bai3;


import java.util.NoSuchElementException;

public class MyArrayIterator implements Iterator {
    private String[] items;
    private int position;

    public MyArrayIterator(String[] items) {
        this.items = items;
        this.position = 0;
    }

    public String next() {
        /* TODO */
       return items[position++];
    }

    public boolean hasNext() {
        /* TODO */
        if(position < items.length){
            return true;
        }
        return false;
    }
}
