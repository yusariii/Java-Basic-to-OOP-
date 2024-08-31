package Bai2_QLCB;

public abstract class Canbo {
    String HoTen;
    int Tuoi;
    String GioiTinh;
    String DiaChi;

    public Canbo(String HoTen, int Tuoi, String GioiTinh, String DiaChi){
        this.HoTen = HoTen;
        this.Tuoi = Tuoi;
        this.GioiTinh = GioiTinh;
        this.DiaChi = DiaChi;
    }

    public void setName(String HoTen){
        this.HoTen = HoTen;
    }
    public String getName(){
        return this.HoTen;
    }
    public void setAge(int Tuoi){
        this.Tuoi = Tuoi;
    }
    public int getAge(){
        return this.Tuoi;
    }
    public void setGenger(String GioiTinh){
        this.GioiTinh = GioiTinh;
    }
    public String getGender(){
        return this.GioiTinh;
    }
    public void setAddress(String DiaChi){
        this.DiaChi = DiaChi;
    }
    public String getAddress(){
        return this.DiaChi;
    }
}