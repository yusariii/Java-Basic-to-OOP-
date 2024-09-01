package Bai3_QLTV.ClassPack;

public class TapChi extends TaiLieu{
    int SoPhatHanh;
    int ThangPhatHanh;

    public TapChi(int MaTaiLieu, String TenNXB, int SoBanPhatHanh, int SoPhatHanh, int ThangPhatHanh){
        super(MaTaiLieu, TenNXB, SoBanPhatHanh);
        this.SoPhatHanh = SoPhatHanh;
        this.ThangPhatHanh = ThangPhatHanh;
    }

    public void setSPH(int SoPhatHanh){
        this.SoPhatHanh = SoPhatHanh;
    }

    public int getSPH(){
        return this.SoPhatHanh;
    }

    public void setTPH(int ThangPhatHanh){
        this.ThangPhatHanh = ThangPhatHanh;
    }

    public int getTPH(){
        return this.ThangPhatHanh;
    }

    public String toString(){
        return "Ma Tai Lieu: " + this.MaTaiLieu + ", NXB: " + this.TenNXB + ", So ban phat hanh: " + this.SoBanPhatHanh + ", So phat hanh: " + this.SoPhatHanh + ", Thang phat hanh: " + this.ThangPhatHanh;
    }
}
