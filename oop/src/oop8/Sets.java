package oop8;

import java.util.*;

public class Sets {
    // Kiem tra phan tu giong nhau roi cho vao mang moi
    public static Set<Integer> intersectionManual(Set<Integer> first,
                                                  Set<Integer> second) {
        Set<Integer> newSet = new HashSet<>();
        for (Integer i : first) {
            if (second.contains(i)) {
                newSet.add(i);
            }
        }
        return newSet;
    }

    public static Set<Integer> unionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> newSet = new HashSet<>();
        for (Integer i : first) {
            newSet.add(i);
        }
        for (Integer i : second) {
            if (!first.contains(i)) {
                newSet.add(i);
            }
        }
        return newSet;
    }

    public static Set<Integer> union(Set<Integer> first, Set<Integer> second) {
        Set<Integer> newSet = new HashSet<>(first);
        newSet.addAll(second);
        return newSet;
    }

    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
        Set<Integer> newSet = new HashSet<>(first);
        newSet.retainAll(second);
        return newSet;
    }

    public static List<Integer> toList(Set<Integer> source) {
        List<Integer> list = new ArrayList<>(source);
        return list;
    }

    public static List<Integer> removeDuplicates(List<Integer> source) {
        Set<Integer> set = new LinkedHashSet<>(source);//Tạo một đối tượng Set mới không chứa phần tử trùng lặp
        List<Integer> list = new ArrayList<>(set);// Chuyển đổi Set thành List
        return list;
    }

    public static List<Integer> removeDuplicatesManual(List<Integer> source) {
        //Set<Integer> set= new HashSet<>(source);
        List<Integer> list = new ArrayList<>();
        for (Integer i : source) {
            if (!list.contains(i)) {
                list.add(i);
            }
        }
        return list;
    }
    public static String firstRecurringCharcter(String s){
        Set<Character> set = new HashSet<>();
        for ( char c : s.toCharArray()) {
            if(set.contains(c)){
                return String.valueOf(c);
            }
            set.add(c);
        }
        return null;
    }
    public static Set<Character> allRecurringChars(String s){
        Set<Character> set = new HashSet<>();
        Set<Character> set1 = new HashSet<>();
        for ( char c: s.toCharArray()) {
            if(set.contains(c)){
                set1.add(c);
            }
            set.add(c);
        }
        return set1;
    }
    public static Integer[] toArray(Set<Integer> source){
        Integer [] arr = new Integer[source.size()];
        source.toArray(arr);
        return arr;
    }
    public static int getFirst(TreeSet<Integer> source){
        if (source.isEmpty()) {
            throw new NoSuchElementException("TreeSet is empty");
        }
        return source.first();
    }
    public static int getLast(TreeSet<Integer> source){
        if (source.isEmpty()) {
            throw new NoSuchElementException("TreeSet is empty");
        }
        return source.last();
    }public static int getGreater(TreeSet<Integer> source , int value){
        if (source.isEmpty()) {
            throw new NoSuchElementException("TreeSet is empty");
        }
        Integer result = source.higher(value);
        if (result == null) {
            throw new NoSuchElementException("TreeSet is empty");
        }
        return result;
    }

    public static void main(String[] args) {
        Set<Integer> first = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> second = new HashSet<>(Arrays.asList(1, 2, 3, 6));
        System.out.println(intersectionManual(first, second));
        System.out.println(intersection(first, second));
        System.out.println(unionManual(first, second));
        System.out.println(union(first, second));
        System.out.println(toList(first));
        List<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,3,4,5,6,6));
        System.out.println(removeDuplicates(list));
        System.out.println(removeDuplicatesManual(list));
        System.out.println(firstRecurringCharcter("abccsab"));
        System.out.println(allRecurringChars("abbbcdde"));
        System.out.println(toArray(first));
        TreeSet<Integer> treeset = new TreeSet<>(Arrays.asList(7,6,4,3,23,1));
        System.out.println(getFirst(treeset));
        System.out.println(getLast(treeset));
        System.out.println(getGreater(treeset , 5));
    }
}
