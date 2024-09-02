package Bai4_TuyenSinh.ClassPack;

public class KhoiB extends ThiSinh{
    public static final String Mon1 = "Toan";
    public static final String Mon2 = "Hoa";
    public static final String Mon3 = "Sinh";

    public KhoiB(int SBD, String HoTen, String DiaChi, int MucUuTien){
        super(SBD, HoTen, DiaChi, MucUuTien);
    }

    @Override
    public String toString(){
        return "So bao danh: " + this.SBD + ". Ho va ten: " + this.HoTen + ". Dia chi: " + this.DiaChi + ". Muc uu tien: " + this.MucUuTien +". Hoc sinh khoi B, cac mon hoc: " + Mon1 + ", " + Mon2 + ", " + Mon3 + ".";
    }
}
