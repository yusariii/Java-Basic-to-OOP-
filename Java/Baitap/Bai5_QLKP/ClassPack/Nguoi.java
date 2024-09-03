package Bai5_QLKP.ClassPack;

public class Nguoi {
    String HoTen;
    int Tuoi;
    String NgheNghiep;
    int SoCMND;

    public Nguoi(String HoTen, int Tuoi, String NgheNghiep, int SoCMND){
        this.HoTen = HoTen;
        this.Tuoi = Tuoi;
        this.NgheNghiep = NgheNghiep;
        this.SoCMND = SoCMND;
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
    
    public void setjob(String NgheNghiep){
        this.NgheNghiep = NgheNghiep;
    }
    public String getjob(){
        return this.NgheNghiep;
    }
    public void setCMND(int SoCMND){
        this.SoCMND = SoCMND;
    }
    public int getCMND(){
        return this.SoCMND;
    }

}
