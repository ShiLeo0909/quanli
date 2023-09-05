package oop8;

import java.util.*;

public class Maps {
    public static int count(Map<Integer, Integer> map) {
        return map.size();
    }

    public static void empty(Map<Integer, Integer> map) {
        map.clear();
    }

    public static boolean contains(Map<Integer, Integer> map, int key) {
        if (map.containsKey(key)) {
            return true;
        }
        return false;
    }

    public static boolean containsKeyValue(Map<Integer, Integer> map, int key, int value) {
        if (map.containsKey(key)) {
            return map.get(key).equals(value);
        }
        return false;
    }

    public static Set<Integer> keySet(Map<Integer, Integer> map) {
        return map.keySet();
    }

    public static Collection<Integer> values(Map<Integer, Integer> map) {
        return map.values();
    }

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 100);
        map.put(2, 200);
        map.put(3, 300);
        map.put(4, 400);
        map.put(5, 500);
        map.put(6, 600);

        System.out.println(count(map));
        System.out.println(containsKeyValue(map , 1, 200));
        System.out.println(keySet(map));
        System.out.println(values(map));
        System.out.println(contains(map , 7));
        empty(map);
    }
}
