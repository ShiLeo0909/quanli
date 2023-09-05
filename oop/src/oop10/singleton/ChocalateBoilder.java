package oop10.singleton;

public class ChocalateBoilder {
    private static ChocalateBoilder instance;
    private boolean empty;
    private boolean boiled;

    private ChocalateBoilder() {
        empty = true;
        boiled = false;
    }

    public static  ChocalateBoilder getInstance() {
        if (instance == null) {
            instance = new ChocalateBoilder();
        }
        return instance;
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
    public void fill(){
        if(isEmpty()){
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }
}
