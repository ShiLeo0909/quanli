package jtextarea.model;

public class TimKiemModel {
    private String vanBan = "";
    private String tuKhoa = "";
    private String ketQua = "";


    public TimKiemModel() {
        this.vanBan = "";
        this.tuKhoa = "";
        this.ketQua = "";
    }

    public String getAnBan() {
        return vanBan;
    }

    public String getTuKhoa() {
        return tuKhoa;
    }

    public String getKetQua() {
        return ketQua;
    }

    public void setAnBan(String anBan) {
        this.vanBan = anBan;
    }

    public void setTuKhoa(String tuKhoa) {
        this.tuKhoa = tuKhoa;
    }

    public void setKetQua(String ketQua) {
        this.ketQua = ketQua;
    }

    public void timKiem() {
        int dem = 0;
        int viTri = 0;
        while (true) {
            int i = this.vanBan.indexOf(this.tuKhoa, viTri);
            if (i == -1) {
                break;
            } else {
                dem++;
                viTri = i + 1;
            }
        }
        this.ketQua = "Kết Quả: có " + dem + "(" +this.tuKhoa + ")";
        System.out.println(ketQua);
    }
}
