package Bai9_Luong.ClassPack;


public class Nguoi {
    String HoTen;
    int Tuoi;
    String QueQuan;
    String MSGV;
    int LuongCung;
    int LuongThuong;
    int TienPhat;

    public Nguoi(String HoTen, int Tuoi, String QueQuan, String MSGV,int LuongCung, int LuongThuong, int TienPhat){
        this.HoTen = HoTen;
        this.Tuoi = Tuoi;
        this.QueQuan = QueQuan;
        this.MSGV = MSGV;
        this.LuongCung = LuongCung;
        this.LuongThuong = LuongThuong;
        this.TienPhat = TienPhat;
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

    public void setMSGV(String MSGV){
        this.MSGV = MSGV;
    }
    public String getMSGV(){
        return this.MSGV;
    }

    public void setAddress(String QueQuan){
        this.QueQuan = QueQuan;
    }
    public String getAddress(){
        return this.QueQuan;
    }

    public void setLC(int LuongCung){
        this.LuongCung = LuongCung;
    }
    public int getLC(){
        return this.LuongCung;
    }

    public void setLT(int LuongThuong){
        this.LuongThuong = LuongThuong;
    }
    public int getLT(){
        return this.LuongThuong;
    }

    public void setTP(int TienPhat){
        this.TienPhat = TienPhat;
    }
    public int getTP(){
        return this.TienPhat;
    }
    
    public int getL(){
        return this.LuongCung + this.LuongThuong - this.TienPhat;
    }

    public String toString(){
        return "Thong tin giao vien:\n" + "Ho va ten: " + this.HoTen + "\n" + "Tuoi: " + this.Tuoi + "\n" + "Que quan: " + this.QueQuan + "\n" + "Ma so giao vien: " + this.MSGV + "\n" + "Luong cung: " + this.LuongCung + "\n" + "Luong thuong: " + this.LuongThuong + "\n" + "Tien phat: " + this.TienPhat + "\n" + "Luong thuc: " + this.getL();
    }
}