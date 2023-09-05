package QuanLiSinhVien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

public class DanhSachSinhVien {
    private ArrayList<SinhVien> danhSach;

    public DanhSachSinhVien() {
        this.danhSach = new ArrayList<SinhVien>();
    }

    public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
        this.danhSach = danhSach;
    }

    // 1.	Thêm sinh viên vào danh sách.
    public void themSinhVien(SinhVien sv) {
        this.danhSach.add(sv);
    }

    //		2.	In danh sách sinh viên ra màn hình.
    public void inDanhSachSinhVien() {
        for (SinhVien sinhVien : danhSach) {
            System.out.println(sinhVien);
        }
    }

    //		3.	Kiểm tra danh sách có rỗng hay không.
    public boolean kiemTraDanhSachRong() {
        return this.danhSach.isEmpty();
    }

    //		4.	Lấy ra số lượng sinh viên trong danh sách.
    public int laySoLuongSinhVien() {
        return this.danhSach.size();
    }

    //		5.	Làm rỗng danh sách sinh viên.
    public void lamRongDanhSach() {
        this.danhSach.removeAll(danhSach);
    }

    //		6.	Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.
    public boolean kiemTraTonTai(SinhVien sv) {
        return this.danhSach.contains(sv);
    }

    //		7.	Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.
    public boolean xoaSinhVien(SinhVien sv) {
        return this.danhSach.remove(sv);
    }

    //		8.	Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.
    public void timSinhVien(String ten) {
        for (SinhVien sinhVien : danhSach) {
            if (sinhVien.getHoVaTen().indexOf(ten) >= 0) {
                System.out.println(sinhVien);
            }
        }
    }

    //		9.	Xuất ra danh sách sinh viên có điểm từ cao đến thấp.
    public void sapXepSinhVienGiamDanTheoDiem() {
        Collections.sort(this.danhSach, new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                if (sv1.getDiemTrungBinh() < sv2.getDiemTrungBinh()) {
                    return 1;
                } else if (sv1.getDiemTrungBinh() > sv2.getDiemTrungBinh()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
    }

    public static class SinhVien implements Comparable<SinhVien>{
        private String maSinhVien;
        private String hoVaTen;
        private int namSinh;
        private float diemTrungBinh;


        public SinhVien(String maSinhVien) {
            this.maSinhVien = maSinhVien;
        }

        public SinhVien(String maSinhVien, String hoVaTen, int namSinh, float diemTrungBinh) {
            this.maSinhVien = maSinhVien;
            this.hoVaTen = hoVaTen;
            this.namSinh = namSinh;
            this.diemTrungBinh = diemTrungBinh;
        }

        public String getMaSinhVien() {
            return maSinhVien;
        }

        public void setMaSinhVien(String maSinhVien) {
            this.maSinhVien = maSinhVien;
        }

        public String getHoVaTen() {
            return hoVaTen;
        }

        public void setHoVaTen(String hoVaTen) {
            this.hoVaTen = hoVaTen;
        }

        public int getNamSinh() {
            return namSinh;
        }

        public void setNamSinh(int namSinh) {
            this.namSinh = namSinh;
        }

        public float getDiemTrungBinh() {
            return diemTrungBinh;
        }

        public void setDiemTrungBinh(float diemTrungBinh) {
            this.diemTrungBinh = diemTrungBinh;
        }



        @Override
        public String toString() {
            return "SinhVien [maSinhVien=" + maSinhVien + ", hoVaTen=" + hoVaTen + ", namSinh=" + namSinh
                    + ", diemTrungBinh=" + diemTrungBinh + "]";
        }

        @Override
        public int compareTo(SinhVien o) {
            return this.maSinhVien.compareTo(o.maSinhVien);
        }

        @Override
        public int hashCode() {
            return Objects.hash(diemTrungBinh, hoVaTen, maSinhVien, namSinh);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            SinhVien other = (SinhVien) obj;
            return Objects.equals(maSinhVien, other.maSinhVien);
        }



    }
}
