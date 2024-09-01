package Bai3_QLTV.ClassPack;

public class Sach extends TaiLieu{
    String TenTacGia;
    int SoTrang;

    public Sach(int MaTaiLieu, String TenNXB, int SoBanPhatHanh, String TenTacGia, int SoTrang){
        super(MaTaiLieu, TenNXB, SoBanPhatHanh);
        this.TenTacGia = TenTacGia;
        this.SoTrang = SoTrang;
    }

    public void setTG(String TenTacGia){
        this.TenTacGia = TenTacGia;
    }

    public String getTG(){
        return this.TenTacGia;
    }

    public void setSoTrang(int SoTrang){
        this.SoTrang = SoTrang;
    }

    public int getSoTrang(){
        return this.SoTrang;
    }

    public String toString(){
        return "Ma Tai Lieu: " + this.MaTaiLieu + ", NXB: " + this.TenNXB + ", So ban phat hanh: " + this.SoBanPhatHanh + ", Tac gia: " + this.TenTacGia + ", So trang: " + this.SoTrang;
    }
}
