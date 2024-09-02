package Bai4_TuyenSinh;

import Bai4_TuyenSinh.ClassPack.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TuyenSinh {
    private List<ThiSinh> Arr;

    public TuyenSinh(){
        this.Arr = new ArrayList<>();
    }

    // Them moi thi sinh
    public void addTS(ThiSinh ThiSinh){
        this.Arr.add(ThiSinh);
    }

    // Hien thi thong tin va khoi
    public void DSTS(){
        this.Arr.forEach(o -> System.out.println(o.toString()));
    }

    // Tim kiem theo so bao danh
    public List<ThiSinh> findSBD(int SBD){
        return this.Arr.stream().filter(o -> o.getSBD() == SBD).collect(Collectors.toList());
    }
}
