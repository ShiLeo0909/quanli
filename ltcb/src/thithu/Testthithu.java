package thithu;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Testthithu {
    public static ArrayList<Dssach> readFile(String file){
        ArrayList<Dssach> list = new ArrayList<>();
        try{
            Scanner sc = new Scanner(new File(file));
            while( sc.hasNextLine()){
                String id = sc.nextLine();
                String tenSach = sc.nextLine();
                String tacGia = sc.nextLine();
                int gia = sc.nextInt();
                double giamGia = sc.nextDouble();
                list.add(new Dssach(id , tenSach , tacGia , gia , giamGia));
                sc.nextLine();
            }
            sc.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        return list;
    }
    
    public static void sort (ArrayList<Dssach> list){
        for (int i = 0; i <  list.size()-1; i++) {
            for (int j = i+1; j < list.size(); j++) {
                if(list.get(i).getTacGia().compareTo(list.get(j).getTacGia())> 0){
                    Dssach tmp = list.get(i);
                    list.set(i , list.get(j));
                    list.set(j , tmp);
                }
            }
        }
    }
    public static KhachHang input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap id cua ban");
        String idkh = sc.nextLine();
        System.out.println("Nhap ho va ten cua ban");
        String Name = sc.nextLine();
        System.out.println("Nhap so sach ban muon mua");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap id sach muon mua");
        ArrayList<String> sach = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sach.add(sc.nextLine());
        }
        System.out.println("Neu ban la khach vip nhap 1 , neu khong phai nhap 0");
        int vip = sc.nextInt();
        return new KhachHang(idkh , Name , sach , vip );
    }

    public static void WriteFile(KhachHang uy, ArrayList<Dssach> list , String file) {
        try{
            FileWriter f = new FileWriter(file);
            f.write("Mkh : " + uy.getIdkh() + "\n");
            f.write("Ten kh :" + uy.getName() + "\n");
            int num = 1;
            for (int i = 0; i < uy.getList().size(); i++) {
                for (int j = 0; j < list.size() ; j++) {
                    if(uy.getList().get(i).equals(list.get(j).getId())){
                        f.write( "Sach Da Mua :" + num++ + "," + list.get(j).getId() + "," + list.get(j).getTenSach()
                        + "," + list.get(j).getTacGia() + "," + list.get(j).getGia() + "vnd" + list.get(j).getGiamGia() + "%." + "\n");
                    }
                }
            }
            f.write( "Thanh tien =" + String.format("%.3f" , Amount(uy ,list)) + "vnd");
            f.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
     public static double Amount ( KhachHang uy , ArrayList<Dssach> list){
        double amount = 1;
         for (int i = 0; i < uy.getList().size() ; i++) {
             for (int j = 0; j < list.size() ; j++) {
                 if(uy.getList().get(i).equals(list.get(j).getId())){
                     if(uy.getVip() == 1){
                         amount += list.get(j).getGia() * (100-list.get(j).getGiamGia())/100;
                     }else{
                         amount += list.get(j).getGia();
                     }
                 }
             }
         }
         return amount/1000;
     }

    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        ArrayList<Dssach> list = readFile("book.txt");
        sort(list);
        KhachHang uy = input();
        WriteFile(uy , list , "invoice.txt");
    }
}