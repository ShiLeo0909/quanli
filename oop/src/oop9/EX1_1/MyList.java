package oop9.EX1_1;

public interface MyList {
    void add(Object o, int index);

    void add(Object o);

    void remove(int index);

    Object get(int index);

    int size();
}
