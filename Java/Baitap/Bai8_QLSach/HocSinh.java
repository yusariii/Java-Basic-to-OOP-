package Bai8_QLSach;

public class HocSinh {
    String HoTen;
    int Tuoi;
    String Lop;

    public HocSinh(String HoTen, int Tuoi, String Lop){
        this.HoTen = HoTen;
        this.Tuoi = Tuoi;
        this.Lop = Lop;
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

    public void setLop(String Lop){
        this.Lop = Lop;
    }
    public String getLop(){
        return this.Lop;
    }

    @Override
    public String toString(){
        return "Ho va ten: " + this.HoTen + ", tuoi: " + this.Tuoi + ", lop: " + this.Lop;
    }
}
