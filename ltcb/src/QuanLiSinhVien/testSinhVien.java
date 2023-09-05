package QuanLiSinhVien;

import Phim.Ngay;

public class testSinhVien {
    public static void main(String[] args) {
        Ngay ngay1 = new Ngay(15,1,2000);
        Ngay ngay2 = new Ngay(17, 2, 2001);
        Ngay ngay3 = new Ngay(19, 7, 2002);

        Lop lop1 = new Lop("A3","Khoa Hoc May Tinh");
        Lop lop2 = new Lop("A5","Khoa Hoc Du Lieu");
        Lop lop3 = new Lop("A4","Cong Nghe Thong Tin");

        SinhVien sv1 = new SinhVien("01","Phung Huu Uy",ngay1,9.0,lop1);
        SinhVien sv2 = new SinhVien("02","Diep Mac",ngay2,8.0,lop2);
        SinhVien sv3 = new SinhVien("03","Lam Van",ngay3,6.0,lop3);

        System.out.println("Ten Khoa :");
        System.out.println("SV1 :" +  sv1.layTenKhoa());
        System.out.println("SV2 :" +  sv2.layTenKhoa());
        System.out.println("SV3 :" +  sv3.layTenKhoa());

        System.out.println("Kiem tra thi dat");
        System.out.println("SV1 :" +  sv1.kiemTraThiDat());
        System.out.println("SV2 :" +  sv2.kiemTraThiDat());
        System.out.println("SV3 :" +  sv3.kiemTraThiDat());

        System.out.println("Kiem Tra Co Cung Phim.Ngay Sinh Khong");
        System.out.println("SV1 va SV2 :" +  sv1.kiemTraCungNgaySinh(sv2));
        System.out.println("SV1 va SV3 :" +  sv1.kiemTraCungNgaySinh(sv3));
        System.out.println("SV2 va SV3 :" +  sv2.kiemTraCungNgaySinh(sv3));
        
    }
}
