package oop9.EX1_1;

import java.util.ArrayList;

public class TestMain {
    public static void main(String[] args) {
        MyArrayList arraylist = new MyArrayList();
        arraylist.add(6);
        arraylist.add(5);
        arraylist.add(1);
        arraylist.add(9);
        arraylist.add(-5,2);
        System.out.println(arraylist);
        System.out.println(arraylist.get(0));

        MyLinkList myLinkedList = new MyLinkList();
        myLinkedList.add(5);
        myLinkedList.add(6);
        myLinkedList.add(7);
        myLinkedList.add(9,1);
        myLinkedList.remove(2);
        System.out.println(myLinkedList.get(1));
        System.out.println(myLinkedList);
    }
}
