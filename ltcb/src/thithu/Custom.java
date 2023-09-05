package thithu;
import java.util.ArrayList;

public class Custom {
    private String idcustom;
    private String namecustom;
    private ArrayList<String> list = new ArrayList<>();
    private int vip;
    public Custom(String idcustom , String namecustom , ArrayList<String> list , int vip){
        this.idcustom=idcustom;
        this.namecustom=namecustom;
        this.list=list;
        this.vip=vip;
    }
    public String getIDCustom(){
        return this.idcustom;
    }
    public String getNameCustom(){
        return this.namecustom;
    }
    public int getSizeList(){
        return list.size();
    }
    public ArrayList<String> getListID(){
        return this.list;
    }
    @Override
    public String toString() {
        return "Ma KH : " + this.idcustom + "\n Ten khach hang : " + this.namecustom + " \n Danh sach sach da mua : ";
    }
}
