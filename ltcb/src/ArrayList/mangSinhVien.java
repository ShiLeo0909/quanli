package ArrayList;

public class mangSinhVien {
    private String hoVaTen;
    private String queQuan;
    private double diemTrungBinh;

    public mangSinhVien(String hoVaTen, String queQuan ,double diemTrungBinh){
        this.hoVaTen = hoVaTen;
        this.queQuan = queQuan;
        this.diemTrungBinh = diemTrungBinh;
    }
    
    public String gethoVaTen(){
        return hoVaTen;
    }
    public void sethoVaTen(String hoVaTen){
        this.hoVaTen = hoVaTen;
    }
    public String getqueQuan(){
        return queQuan;
    }
    public void setqueQuan(String queQuan){
        this.queQuan = queQuan ;
    }
    public Double getdiemTrungBinh() {
        return diemTrungBinh;
    }
    public void setdiemTrungBinh(double diemTrungBinh){
        this.diemTrungBinh = diemTrungBinh;
    }
    public String toString(){
        return hoVaTen + "/" + queQuan + "/" + diemTrungBinh ; 
    }

}
