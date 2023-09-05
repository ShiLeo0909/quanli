package oop9.EX1_2;

public class TestMain {
    public static void main(String[] args) {
        MyMap map = new MyHashMap();
        map.put(500,"UyLeo");
        //map.put(32,"lll");
        //map.put(34,"jjj");
        map.put(11,"Nicola");
        map.put(501,"ooo");
        map.put(12,"Nicola");
        map.put(14,"ppp");
        //map.put(15,"uuu");
        map.put(21,"Marzia");
        map.put(33,"Agata");
        map.remove(21);
        System.out.println(map.contains(11));
        System.out.println(map.contains(77));
        System.out.println(map.size());
        System.out.println(map);
    }
}


