package Bai8_QLSach;

import java.util.List;
import java.util.ArrayList;

public class QuanLyPhieu {
    private List<PhieuMuon> PhieuMuon;

    public QuanLyPhieu(){
        PhieuMuon = new ArrayList<>();
    }

    public void add(PhieuMuon PhieuMuonMoi){
        this.PhieuMuon.add(PhieuMuonMoi);
    }

    public boolean delete(int MaMuon){
        PhieuMuon PhieuXoa = this.PhieuMuon.stream().filter(o -> o.getMa() == MaMuon).findFirst().orElse(null);
        if (PhieuXoa == null){
            return false;
        } else {
            this.PhieuMuon.remove(PhieuXoa);
            return true;
        }
    }

    public void DSPhieuMuon(){
        this.PhieuMuon.forEach(o -> System.out.println(o.toString()));
    }
}
