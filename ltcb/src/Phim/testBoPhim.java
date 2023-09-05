package Phim;

import Phim.BoPhim;

public class testBoPhim {
    public static void main(String[] args) {
        Ngay ngay1 = new Ngay(1 , 1 , 2004);
        Ngay ngay2 = new Ngay(3 ,3 ,20008);
        Ngay ngay3 = new Ngay(8,8,2019);
        HangSanXuat hang1 = new HangSanXuat("Lappat", "Nhat Ban");
        HangSanXuat hang2 = new HangSanXuat("Marvel", "America");
        HangSanXuat hang3 = new HangSanXuat("CCC", "Thien Dau");
        BoPhim phim1 = new BoPhim("Thieu gia bi bo roi",1996,hang1,50000,ngay1);
        BoPhim phim2 = new BoPhim("Dau la Dai Luc",1994,hang2,200000,ngay3);
        BoPhim phim3 = new BoPhim("Dau Pha Thuong Khung",2004,hang3,500000,ngay2); 
        System.out.println("So sanh gia ve phim1 co nho hon phim 2" + phim1.kiemTraGiaVeReHon(phim2));
        System.out.println("So sanh gia ve phim2 co nho hon phim 3" + phim2.kiemTraGiaVeReHon(phim3));
        System.out.println("So sanh gia ve phim1 co nho hon phim 3" + phim1.kiemTraGiaVeReHon(phim3));
        System.out.println(hang1.getTenHangSanXuat());
        System.out.println(hang2.getTenHangSanXuat());
        System.out.println(hang3.getTenHangSanXuat());
        System.out.println(phim1.giaSauKhiGiam(10));
        System.out.println(phim2.giaSauKhiGiam(20));
        System.out.println(phim3.giaSauKhiGiam(40));                              
    }  
}
