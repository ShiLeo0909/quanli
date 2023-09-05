package bai3;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class MyListIterator implements Iterator {
    private ArrayList<String> items;
    private int position;

    public MyListIterator(ArrayList<String> items) {
        this.items = items;
        this.position = 0;
    }

    public String next() {
        /* TODO */
       return items.get(position++);
    }

    public boolean hasNext() {
        /* TODO */
        if(position < items.size()){
            return true;
        }else{
            return false;
        }
    }
}
