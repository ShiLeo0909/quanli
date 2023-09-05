package oop9.EX1_2;

import java.util.Map;

public class MyHashMap implements MyMap {
    private final static int INITIAL_SIZE = 8;
    private MyHashMapEntry [] table;
    private int size;

    public MyHashMap() {
        table = new MyHashMapEntry[INITIAL_SIZE];
        size = 0;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void put(Object key, Object value) {
        if(capacityRatio() > 0.75){
            enlarge();
        }
        int bucket = getBuket(key);
        if(table[bucket] == null){
            table[bucket] = new MyHashMapEntry(key ,value);
            size++;
        }
    }

    @Override
    public void remove(Object key) {
        int bucket = getBuket(key);
        if(table[bucket] != null && table[bucket].getKey().equals(key)){
            table[bucket] =null;
            size--;
        }
    }

    @Override
    public boolean contains(Object key) {
        for(MyHashMapEntry entry: table){
            if(entry != null && (entry.getKey().equals(key) || entry.getValue().equals(key))){
                return true;
            }
        }
        return false;
    }

    @Override
    public Object get(Object key) {
        int bucket = getBuket(key);
        if(table[bucket] != null){
            return table[bucket].getValue();
        }
        return -1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < table.length; i++) {
            if (table[i] == null) {
                sb.append(String.format("[bucket %d] -> null\n", i));
            } else {
                sb.append(String.format("[bucket %d] -> (%s, %s)\n", i, table[i].getKey(), table[i].getValue()));
            }
        }
        return sb.toString();
    }

    public int getBuket(Object key) {
        int bucket = (Math.abs(key.hashCode()) % table.length);
        while (table[bucket] != null && table[bucket].getKey() != key){
            bucket = (bucket +1)% table.length;
        }
        return bucket;
    }
    public double capacityRatio(){
        return size / (double) table.length;
    }
    public void enlarge(){
        Object[] newData = new Object[table.length *2];
        System.arraycopy(table,0,newData,0,table.length);
        table = (MyHashMapEntry[]) newData;
    }
}
