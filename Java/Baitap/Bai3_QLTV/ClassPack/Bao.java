package Bai3_QLTV.ClassPack;

public class Bao extends TaiLieu{
    int NgayPhatHanh;

    public Bao(int MaTaiLieu, String TenNXB, int SoBanPhatHanh, int NgayPhatHanh){
        super(MaTaiLieu, TenNXB, SoBanPhatHanh);
        this.NgayPhatHanh = NgayPhatHanh;
    }

    public void setNPH(int NgayPhatHanh){
        this.NgayPhatHanh = NgayPhatHanh;
    }

    public int getNPH(){
        return this.NgayPhatHanh;
    }

    public String toString(){
        return "Ma Tai Lieu: " + this.MaTaiLieu + ", NXB: " + this.TenNXB + ", So ban phat hanh: " + this.SoBanPhatHanh + ", Ngay phat hanh: " + this.NgayPhatHanh;
    }
}
