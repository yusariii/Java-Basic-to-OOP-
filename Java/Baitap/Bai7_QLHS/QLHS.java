package Bai7_QLHS;

import java.util.List;
import java.util.stream.Collectors;

import Bai7_QLHS.ClassPack.HocSinh;

import java.util.ArrayList;

public class QLHS {
    private List<HocSinh> Arr;

    public QLHS(){
        Arr = new ArrayList<>();
    }

    public void add(HocSinh HocSinh){
        this.Arr.add(HocSinh);
    }

    public List<HocSinh> DSHS20Tuoi(){
        return this.Arr.stream().filter(o -> o.getAge() == 20).collect(Collectors.toList());
    }

    public long HS23TuoiVaQueDN(){
        return this.Arr.stream().filter(o -> o.getAge() == 23 && o.getQue() == "DN").count();
    }
}
