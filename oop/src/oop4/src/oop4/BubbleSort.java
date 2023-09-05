package oop4;

public class BubbleSort
{
    public static void main(String[] args) {
        int [] arr = {5 , 4 , 3 , 2 ,1 ,7 };
        Bubble (arr);
    }
    public static void Bubble (int [] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i +1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i]);
        }
    }
}
