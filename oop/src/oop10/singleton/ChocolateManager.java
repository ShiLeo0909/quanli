package oop10.singleton;

public class ChocolateManager {
    public static void main(String[] args) {
        ChocalateBoilder boilder = ChocalateBoilder.getInstance();
        boilder.fill();
        boilder.boil();
        boilder.drain();
        ChocalateBoilder boildaer2 = ChocalateBoilder.getInstance();
        if(boildaer2 == boilder){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
