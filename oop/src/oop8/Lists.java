package oop8;

import java.util.*;

//Chen Dau
public class Lists {
    public static void insertFirst(List<Integer> list, int value) {
        list.add(0, value);
        System.out.println(list);
    }

    //Chen Cuoi
    public static void insertLast(List<Integer> list, int value) {
        list.add(list.size(), value);
        System.out.println(list);
    }

    // Xoa phan tu thu 3
    public static void removeThird(List<Integer> list) {
        list.remove(2);
        System.out.println(list);
    }

    //Xoa phan tu co gia tri "666"
    public static void removeEvil(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 666) {
                list.remove(i);
            }
        }
        System.out.println(list);
    }

    // In ra 10 so chich phuong dau tien
    public static List<Integer> generateSquate() {
        List<Integer> newList = new ArrayList<>();
        int count = 0;
        for (int i = 1; i <= 10; i++) {
            newList.add(i * i);
        }
        return newList;
    }

    // Kiem tra xem so do co ton tai khong
    public static boolean contain(List<Integer> list, int value) {
        for (int i = 0; i < list.size(); i++) {
            if (value == list.get(i)) {
                return true;
            }
        }
        return false;
    }

    //Copy
    public static void copy(List<Integer> source, List<Integer> target) {
        target.addAll(source);
        System.out.println(target);
    }

    //Dao Nguoc Dung thu Vien
    public static void reverse(List<Integer> list) {
        Collections.reverse(list);
        System.out.println(list);
    }

    // Dao Nguoc Khogn Dung Thu VIen
    public static void reverseManual(List<Integer> list) {
        for (int i = 0; i < list.size() / 2; i++) {
            int temp = list.get(i);
            list.set(i, list.get(list.size()-1-i));
            list.set(list.size() - i - 1, temp);
        }
        System.out.println(list);
    }

    // Them vao dau va cuoi
    public static void insertBeginningEnd(LinkedList<Integer> list, int value) {
        list.add(0, value);
        list.add(list.size(), value);
        System.out.println(list);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        insertFirst(list, 4);
        insertFirst(list, 3);
        insertFirst(list, 2);
        insertFirst(list, 1);
        insertLast(list, 5);
        insertLast(list, 666);
        removeThird(list);
        removeEvil(list);
        System.out.println(generateSquate());
        System.out.println(contain(list, 6));
        List<Integer> newList = new ArrayList<>();
        copy(list, newList);
        reverse(list);
        reverseManual(list);
        LinkedList<Integer> list1 = new LinkedList<>(list);
        insertBeginningEnd(list1, 0);
    }
}
