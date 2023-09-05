package thithu;

public class Dssach{
    private String id;
    private String tenSach;
    private String tacGia;
    private int gia ;
    private double giamGia;

    public Dssach(String id , String tenSach  , String tacGia , int gia , double giamGia){
        this.id = id;
        this.tenSach = tenSach ;
        this.tacGia = tacGia ;
        this.gia = gia;
        this.giamGia = giamGia;
    }

    public String getId() {
        return id;
    }

    public String getTenSach() {
        return tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public int getGia() {
        return gia;
    }

    public double getGiamGia() {
        return giamGia;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public void setGiamGia(double giamGia) {
        this.giamGia = giamGia;
    }
}