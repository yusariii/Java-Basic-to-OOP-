package Bai6_QLKS.ClassPack;

public class Phong {

    String LoaiPhong;
    int GiaPhong;

    public Phong(String LoaiPhong, int GiaPhong){
        this.LoaiPhong = LoaiPhong;
        this.GiaPhong = GiaPhong;
    }

    public void setLoai(String LoaiPhong){
        this.LoaiPhong = LoaiPhong;
    }
    public String getLoai(){
        return this.LoaiPhong;
    }

    public void setGiaPhong(int GiaPhong){
        this.GiaPhong = GiaPhong;
    }
    public int getGiaPhong(){
        return this.GiaPhong;
    }

}
