package Bai6_QLKS.ClassPack;

public class Nguoi {
    String HoTen;
    int Tuoi;
    int SoCMND;
    Phong phong;
    int SoNgayThue;

    public Nguoi(String HoTen, int Tuoi, int SoCMND, Phong phong, int SoNgayThue){
        this.HoTen = HoTen;
        this.Tuoi = Tuoi;
        this.SoCMND = SoCMND;
        this.phong = phong;
        this.SoNgayThue = SoNgayThue;
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
    
    public void setCMND(int SoCMND){
        this.SoCMND = SoCMND;
    }
    public int getCMND(){
        return this.SoCMND;
    }

    public void setPhong(Phong phong){
        this.phong = phong;
    }
    public Phong getPhong(){
        return this.phong;
    }

    public void setNgayThue(int SoNgayThue){
        this.SoNgayThue = SoNgayThue;
    }
    public int getNgayThue(){
        return this.SoNgayThue;
    }

    @Override
    public String toString(){
        return "Ho va ten: " + this.HoTen + ", tuoi: " + this.Tuoi + ", so CMND: " + this.SoCMND + "\n" + "Chi tiet thue phong:" + "\n" + phong.toString();
    }
}
