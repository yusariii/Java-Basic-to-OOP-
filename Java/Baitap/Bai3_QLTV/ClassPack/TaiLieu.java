package Bai3_QLTV.ClassPack;

public abstract class TaiLieu {
    int MaTaiLieu;
    String TenNXB;
    int SoBanPhatHanh;

    public TaiLieu(int MaTaiLieu, String TenNXB, int SoBanPhatHanh){
        this.MaTaiLieu = MaTaiLieu;
        this.TenNXB = TenNXB;
        this.SoBanPhatHanh = SoBanPhatHanh;
    }

    public void setMTL(int MaTaiLieu){
        this.MaTaiLieu = MaTaiLieu;
    }

    public int getMTL(){
        return this.MaTaiLieu;
    }
    public void setNXB(String TenNXB){
        this.TenNXB = TenNXB;
    }

    public String getNXB(){
        return this.TenNXB;
    }
    public void setBPH(int SoBanPhatHanh){
        this.SoBanPhatHanh = SoBanPhatHanh;
    }

    public int getBPH(){
        return this.SoBanPhatHanh;
    }
}
