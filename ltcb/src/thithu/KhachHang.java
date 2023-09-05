package thithu;

import java.util.ArrayList;

public class KhachHang {
    private String idkh ;
    private String Name;
    private ArrayList<String> list;
    private int vip ;

    public KhachHang(String idkh , String Name , ArrayList<String> list , int vip ){
        this.idkh= idkh;
        this.Name = Name;
        this.list = list;
        this.vip = vip;
    }

    public String getIdkh() {
        return idkh;
    }

    public ArrayList<String> getList() {
        return list;
    }

    public String getName() {
        return Name;
    }

    public int getVip() {
        return vip;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setIdkh(String idkh) {
        this.idkh = idkh;
    }

    public void setList(ArrayList<String> list) {
        this.list = list;
    }

    public void setVip(int vip) {
        this.vip = vip;
    }
}