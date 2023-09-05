package Phim;

public class BoPhim {
    private String tenPhim;
    private int namSanXuat;
    private HangSanXuat hangSanXuat;
    private double giaVe;
    private Ngay ngayChieu;
    public  BoPhim(String tenPhim, int namSanXuat, HangSanXuat hangSanXuat, double giaVe, Ngay ngayChieu){
        this.tenPhim = tenPhim;
        this.namSanXuat = namSanXuat;
        this.giaVe = giaVe;
        this.hangSanXuat = hangSanXuat;
        this.namSanXuat = namSanXuat;
        this.ngayChieu = ngayChieu;
    }
    public String getTenPhim() {
        return tenPhim;
    }
    public void setTenPhim(String tenPhim) {
        this.tenPhim = tenPhim;
    }
    public double getGiaVe() {
        return giaVe;
    }
    public void setGiaVe(double giaVe) {
        this.giaVe = giaVe;
    }
    public HangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }
    public void setHangSanXuat(HangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }
    public int getNamSanXuat() {
        return namSanXuat;
    }
    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }
    public Ngay getNgayChieu() {
        return ngayChieu;
    }
    public void setNgayChieu(Ngay ngayChieu) {
        this.ngayChieu = ngayChieu;
    }
    public boolean kiemTraGiaVeReHon(BoPhim phimKhac) {
        return this.giaVe < phimKhac.giaVe;      
    }
    public String layTenHangSanXuatPhim(){
        return this.hangSanXuat.getTenHangSanXuat();
    }
    public double giaSauKhiGiam( double x){
        return this.giaVe * (1-x/100);
    }
}
