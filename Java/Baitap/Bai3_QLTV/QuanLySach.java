package Bai3_QLTV;

import Bai3_QLTV.ClassPack.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QuanLySach {
    private List<TaiLieu> Arr;

    public QuanLySach(){
        this.Arr = new ArrayList<>();
    }

    // Them moi tai lieu
    public void addTL(TaiLieu TaiLieu){
        this.Arr.add(TaiLieu);
    }

    // Xoa tai lieu theo ma tai lieu
    public void XoaTaiLieu(int MaTaiLieu){
        this.Arr.removeIf(o -> o.getMTL() == MaTaiLieu);
    }

    // Hien thi thong tin ve tai lieu
    public void DSTL(){
        this.Arr.forEach(o -> System.out.println(o.toString()));
    }

    // Tim kiem tai lieu theo loai
    public void TimSach(){
        this.Arr.stream().filter(o -> o instanceof Sach).forEach(o -> System.out.println(o.toString()));
    }
    public void TimTapChi(){
        this.Arr.stream().filter(o -> o instanceof TapChi).forEach(o -> System.out.println(o.toString()));
    }
    public void TimBao(){
        this.Arr.stream().filter(o -> o instanceof Bao).forEach(o -> System.out.println(o.toString()));
    }
}
