package Bai2_QLCB;

public class CongNhan extends Canbo{
    int Bac;
    public CongNhan(String HoTen, int Tuoi, String GioiTinh, String DiaChi, int Bac){
        super(HoTen, Tuoi, GioiTinh, DiaChi);
        if (Bac >= 1 && Bac <= 10){
            this.Bac = Bac;
        }
        else {
            throw new IllegalArgumentException("Bac cua Cong Nhan tu 1 toi 10");
        }
    }
    public void setLevel(int Bac){
        this.Bac = Bac;
    }
    public int getLevel(){
        return this.Bac;
    }

    public String toString(){
        return "Công Nhân{" + "Bậc: " + this.Bac + ", họ và tên: " + this.HoTen + ", giới tính: " + this.GioiTinh + ", tuổi: " + this.Tuoi + ", địa chỉ: " + this.DiaChi + "}";
    }
}
