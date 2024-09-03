package Bai5_QLKP.ClassPack;

import java.util.ArrayList;
import java.util.List;

public class HoGiaDinh {
    private List<Nguoi> ThanhVien;
    String SoNha;

    public HoGiaDinh(List<Nguoi> ThanhVien, String SoNha){
        this.ThanhVien = ThanhVien;
        this.SoNha = SoNha;
    }

    public void setTV(List<Nguoi> ThanhVien){
        this.ThanhVien = ThanhVien;
    }
    public List<Nguoi> getTV(){
        return this.ThanhVien;
    }

    public void setAddress(String SoNha){
        this.SoNha = SoNha;
    }
    public String getAddress(){
        return this.SoNha;
    }

    public int getSoTV(){
        return (int)this.ThanhVien.size();
    }
}
