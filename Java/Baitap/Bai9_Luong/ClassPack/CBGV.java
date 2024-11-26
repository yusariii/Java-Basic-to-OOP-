package Bai9_Luong.ClassPack;

import java.util.List;
import java.util.ArrayList;

public class CBGV {
    List<Nguoi> GV;

    public CBGV(){
        GV = new ArrayList<>();
    }

    public void add(Nguoi GVMoi){
        this.GV.add(GVMoi);
    }

    public boolean delete(String MSGV){
        Nguoi GVXoa = this.GV.stream().filter(o -> o.getMSGV() == MSGV).findFirst().orElse(null);
        if (GVXoa == null){
            return false;
        } else {
            this.GV.remove(GVXoa);
            return true;
        }
    }

    public int TinhLuong(String MSGV){
        Nguoi NguoiTinhLuong = this.GV.stream().filter(o -> o.getMSGV() == MSGV).findFirst().orElse(null);
        if (NguoiTinhLuong == null){
            return 0;
        } else {
            return NguoiTinhLuong.getL();
        }
    }

    public void DSLuong(){
        this.GV.forEach(o -> o.toString());
    }
}
