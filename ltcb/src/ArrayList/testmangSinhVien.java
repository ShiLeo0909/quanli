package ArrayList;

import ArrayList.mangSinhVien;

import java.util.ArrayList;
import java.util.Scanner;
public class testmangSinhVien{
    public static void inputSinhVien(ArrayList<mangSinhVien> alistA){
        Scanner sc = new Scanner (System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String hoVaTen = sc.nextLine();
            String queQuan = sc.nextLine();
            Double diemTrungBinh =Double.parseDouble(sc.nextLine());
            alistA.add(new mangSinhVien(hoVaTen, queQuan, diemTrungBinh));
        }
    }
    public static void inmangSinhVien(ArrayList<mangSinhVien> alistA){
        for (int i = 0; i < alistA.size(); i++) {
            System.out.println(alistA.get(i).toString());
        }
    }
    public static ArrayList<mangSinhVien> findMaxdiemTrungBinh(ArrayList<mangSinhVien> alistA){
        ArrayList<mangSinhVien> maxdiemTrungBinh = new ArrayList<>();
        double max = alistA.get(0).getdiemTrungBinh();
        for(mangSinhVien c: alistA)
        if(max < c.getdiemTrungBinh())
           max = c.getdiemTrungBinh();
        for (mangSinhVien c: alistA)
            if(max == c.getdiemTrungBinh())
            maxdiemTrungBinh.add(c);
        return maxdiemTrungBinh;    
    }
    public static void diem (ArrayList<mangSinhVien> alistA){
        for (int i = 0; i < alistA.size() - 1; i++)
            for (int j = 1; j < alistA.size() ; j++)
                if(alistA.get(i).getdiemTrungBinh() < alistA.get(j).getdiemTrungBinh()){
                    mangSinhVien tmp = alistA.get(i);
                    alistA.set(i , alistA.get(j));
                    alistA.set(j , tmp);
                }
                System.out.println("Ds sau khi sap xep");  
                inmangSinhVien(alistA);       
    } 
    public static void main(String[] args){
        ArrayList<mangSinhVien> alistA = new ArrayList();
        inputSinhVien(alistA);
        inmangSinhVien(alistA);
        System.out.println("Cac sinh vien co diem cao nhat");
        ArrayList<mangSinhVien> maxA = findMaxdiemTrungBinh (alistA);
        inmangSinhVien(maxA);
        diem(alistA);
    }          
}