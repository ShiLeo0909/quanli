package oop2;

public class ReverseString {
    public static void main(String[] args) {
        String string = "abcdesf";
        printReverseString(string);
    }

    public static void printReverseString(String string) {
        char[] list = string.toCharArray();
        for (int i = 0; i < string.length() / 2; i++) {
            char tmp = list[i];
            list[i] = list[list.length - i-1];
            list[list.length - i-1] = tmp;
        }
        System.out.println(list);
    }
}