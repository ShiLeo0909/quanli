package oop9.EX1_1;

public class MyArrayList extends MyAbstracList {
    private static final int INITIAL_SIZE = 16;
    private Object[] elements;
    private int size;

    public MyArrayList() {
        elements = new Object[INITIAL_SIZE];
        size = 0;
    }


    @Override
    public void add(Object o, int index) {
        if (size >= elements.length - 1) {
            enlarge();
        }
        Object temp = o;
        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = temp;
        size++;
    }

    @Override
    public void add(Object o) {
        if(size >= elements.length-1){
            enlarge();
        }
        elements[size++] = o;
    }

    @Override
    public void remove(int index) {
        checkBoundaries(index , size -1);
        for (int i = index + 1; i < size; i++) {
            elements[i - 1] = elements[i];
        }

        // Giảm kích thước mảng đi 1
        size--;
    }

    @Override
    public Object get(int index) {
        checkBoundaries(index , size-1);
        return elements[index];
    }

    @Override
    public int size() {
        return size;
    }

    void enlarge(){
        Object [] tmp = new Object[elements.length*2];
        System.arraycopy(elements,0,tmp ,0,elements.length);
        elements = tmp;
    }
}
