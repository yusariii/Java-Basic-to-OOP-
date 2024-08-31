package Bai2_QLCB;

public class KySu extends Canbo{
    String NganhDaoTao;
    public KySu(String HoTen, int Tuoi, String GioiTinh, String DiaChi, String NganhDaoTao){
        super(HoTen, Tuoi, GioiTinh, DiaChi);
        this.NganhDaoTao = NganhDaoTao;
    }
    public void setBranch(String NganhDaoTao){
        this.NganhDaoTao = NganhDaoTao;
    }
    public String getBranch(){
        return this.NganhDaoTao;
    }
    public String toString(){
        return "Kỹ Sư{" + "Ngành đào tạo: " + this.NganhDaoTao + ", họ và tên: " + this.HoTen + ", giới tính: " + this.GioiTinh + ", tuổi: " + this.Tuoi + ", địa chỉ: " + this.DiaChi + "}";
    }
}
