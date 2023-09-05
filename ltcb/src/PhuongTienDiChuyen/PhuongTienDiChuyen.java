package PhuongTienDiChuyen;

public abstract class PhuongTienDiChuyen{
    protected String tenLoaiPhuongTien;
    protected String hangSanXuat;
    
    public PhuongTienDiChuyen(String tenLoaiPhuongTien , String hangSanXuat){
        this.tenLoaiPhuongTien = tenLoaiPhuongTien;
        this.hangSanXuat = hangSanXuat;
    }
    public String getTenLoaiPhuongTien(){
        return tenLoaiPhuongTien;
    }
    public void setTenLoaiPhuongTien(String tenLoaiPhuongTien) {
        this.tenLoaiPhuongTien = tenLoaiPhuongTien;
    }
    public void batDau(){
        System.out.println("Bat dau ....");
    }
    public void tangToc(){
        System.out.println("Tang toc ....");
    }
    public void dungLai(){
        System.out.println("Dung lai...");
    }
    public abstract double layVanToc();
}