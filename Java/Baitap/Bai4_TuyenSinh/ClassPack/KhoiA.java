package Bai4_TuyenSinh.ClassPack;

public class KhoiA extends ThiSinh{
    public static final String Mon1 = "Toan";
    public static final String Mon2 = "Ly";
    public static final String Mon3 = "Hoa";

    public KhoiA(int SBD, String HoTen, String DiaChi, int MucUuTien){
        super(SBD, HoTen, DiaChi, MucUuTien);
    }

    @Override
    public String toString(){
        return "So bao danh: " + this.SBD + ". Ho va ten: " + this.HoTen + ". Dia chi: " + this.DiaChi + ". Muc uu tien: " + this.MucUuTien +". Hoc sinh khoi A, cac mon hoc: " + Mon1 + ", " + Mon2 + ", " + Mon3 + ".";
    }
}