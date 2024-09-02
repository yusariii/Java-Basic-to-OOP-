package Bai4_TuyenSinh.ClassPack;

public class KhoiC extends ThiSinh{
    public static final String Mon1 = "van";
    public static final String Mon2 = "Su";
    public static final String Mon3 = "Dia";

    public KhoiC(int SBD, String HoTen, String DiaChi, int MucUuTien){
        super(SBD, HoTen, DiaChi, MucUuTien);
    }

    @Override
    public String toString(){
        return "So bao danh: " + this.SBD + ". Ho va ten: " + this.HoTen + ". Dia chi: " + this.DiaChi + ". Muc uu tien: " + this.MucUuTien +". Hoc sinh khoi C, cac mon hoc: " + Mon1 + ", " + Mon2 + ", " + Mon3 + ".";
    }
}
