package Bai7_QLHS.ClassPack;

public class HocSinh {
    String HoTen;
    int Tuoi;
    String QueQuan;
    String Lop;

    public HocSinh(String HoTen, int Tuoi, String QueQuan, String Lop){
        this.HoTen = HoTen;
        this.Tuoi = Tuoi;
        this.QueQuan = QueQuan;
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

    public void setQue(String QueQuan){
        this.QueQuan = QueQuan;
    }
    public String getQue(){
        return this.QueQuan;
    }

    public void setLop(String Lop){
        this.Lop = Lop;
    }
    public String getLop(){
        return this.Lop;
    }
}
