package Bai4_TuyenSinh.ClassPack;

public abstract class ThiSinh {
    int SBD;
    String HoTen;
    String DiaChi;
    int MucUuTien;

    public ThiSinh(int SBD, String HoTen, String DiaChi, int MucUuTien){
        this.SBD = SBD;
        this.HoTen = HoTen;
        this.DiaChi = DiaChi;
        this.MucUuTien = MucUuTien;
    }

    public void setSBD(int SBD){
        this.SBD = SBD;
    }
    public int getSBD(){
        return this.SBD;
    }
    
    public void setName(String HoTen){
        this.HoTen = HoTen;
    }
    public String getName(){
        return this.HoTen;
    }

    public void setDiaChi(String DiaChi){
        this.DiaChi = DiaChi;
    }
    public String getDiaChi(){
        return this.DiaChi;
    }

    public void setMUT(int MucUuTien){
        this.MucUuTien = MucUuTien;
    }
    public int getMUT(){
        return this.MucUuTien;
    }

}
