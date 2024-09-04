package Bai6_QLKS;

import Bai6_QLKS.ClassPack.*;
import java.util.ArrayList;
import java.util.List;

public class QLKS {
    List<Nguoi> NguoiThue;

    public QLKS(){
        NguoiThue = new ArrayList<>();
    }

    public void add(Nguoi NguoiThueMoi){
        this.NguoiThue.add(NguoiThueMoi);
    }

    public boolean delete(int SoCMND){
        Nguoi nguoixoa = this.NguoiThue.stream().filter(o -> o.getCMND() == SoCMND).findFirst().orElse(null);
        if (nguoixoa == null){
            return false;
        }
        else {
            this.NguoiThue.remove(nguoixoa);
            return true;
        }
    }

    public int TinhTien(int SoCMND){
        Nguoi nguoithue = this.NguoiThue.stream().filter(o -> o.getCMND() == SoCMND).findFirst().orElse(null);
        if (nguoithue == null){
            return 0;
        }
        else {
            return nguoithue.getNgayThue() * nguoithue.getPhong().getGiaPhong();
        }
    }

    public void DSThue(){
        this.NguoiThue.forEach(p -> System.out.println(p.toString()));
    }
}
