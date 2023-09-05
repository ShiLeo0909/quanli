import java.util.Scanner;
public class bai1bT4{
    public stat
    ic int phanb (int n,int [] array ){
    
        int min=array[0];
    
        for (int num: array ){
            if (min>num) min = num;
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int [n];
        for(int i = 0; i<n; i++ ){
            array[i] = sc.nextInt();
        }
        //int min=array[0];
        for(int i = 0; i<n; i++ ){
            System.out.println(array[i]+" ");
        }
        System.out.println("Số nhỏ nhất trong mảng là :" + phanb(n,array));
    }
}