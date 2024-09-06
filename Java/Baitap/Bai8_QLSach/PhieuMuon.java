package Bai8_QLSach;

public class PhieuMuon {
    int MaMuon;
    int NgayMuon;
    int HanTra;
    int SoHieuSach;
    HocSinh HocSinhMuon;

    public PhieuMuon(int MaMuon, int NgayMuon, int HanTra, int SoHieuSach, HocSinh HocSinhMuon){
        this.MaMuon = MaMuon;
        this.NgayMuon = NgayMuon;
        this.HanTra = HanTra;
        this.SoHieuSach = SoHieuSach;
        this.HocSinhMuon = HocSinhMuon;
    }

    public void setMa(int MaMuon){
        this.MaMuon = MaMuon;
    }
    public int getMa(){
        return this.MaMuon;
    }

    public void setNgay(int NgayMuon){
        this.NgayMuon = NgayMuon;
    }
    public int getNgay(){
        return this.NgayMuon;
    }

    public void setHan(int HanTra){
        this.HanTra = HanTra;
    }
    public int getHan(){
        return this.HanTra;
    }

    public void setId(int SoHieuSach){
        this.SoHieuSach = SoHieuSach;
    }
    public int getId(){
        return this.SoHieuSach;
    }

    public void setHS(HocSinh HocSinhMuon){
        this.HocSinhMuon = HocSinhMuon;
    }
    public HocSinh getHS(){
        return this.HocSinhMuon;
    }

    @Override
    public String toString(){
        return "Ma muon: " + this.MaMuon + "\n" + "Ngay muon: " + this.NgayMuon + "\n" + "Han tra: " + this.HanTra + "\n" + "So hieu sach: " + this.SoHieuSach + "\n" + "Thong tin hoc sinh muon: " + HocSinhMuon.toString();
    }
}
