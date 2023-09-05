package EX1_7;

import java.util.Scanner;

public class Count {
    public static final char SPACE = ' ';
    public static final char TAB = '\t';
    public static final char BREAK_LINE = '\n';


    public static int count(String s) {
        int count = 0;
        int str = s.length();
        boolean notCounted = true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != SPACE && s.charAt(i) != TAB
                    && s.charAt(i) != BREAK_LINE) {
                if (notCounted) {
                    count++;
                    notCounted = false;
                }
            } else {
                notCounted = true;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Số từ trong câu là :" + count(s));
    }
}
