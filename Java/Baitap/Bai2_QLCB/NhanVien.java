package Bai2_QLCB;

public class NhanVien extends Canbo{
    String CongViec;
    public NhanVien(String HoTen, int Tuoi, String GioiTinh, String DiaChi, String CongViec){
        super(HoTen, Tuoi, GioiTinh, DiaChi);
        this.CongViec = CongViec;
    }
    public void setJob(String CongViec){
        this.CongViec = CongViec;
    }
    public String getjob(){
        return this.CongViec;
    }
    public String toString(){
        return "Nhân Viên{" + "Công việc: " + this.CongViec + ", họ và tên: " + this.HoTen + ", giới tính: " + this.GioiTinh + ", tuổi: " + this.Tuoi + ", địa chỉ: " + this.DiaChi + "}";
    }
}
