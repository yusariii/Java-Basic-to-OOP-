package Bai5_QLKP.ClassPack;

import java.util.ArrayList;
import java.util.List;

public class KhuPho {
    private List<HoGiaDinh> CacHGD;

    public KhuPho(){
        this.CacHGD = new ArrayList<>();
    }

    public List<HoGiaDinh> getCHGD(){
        return this.CacHGD;
    }

    public void setCHGD(List<HoGiaDinh> CacHGD){
        this.CacHGD = CacHGD;
    }
    public void addHGD(HoGiaDinh HoGiaDinh){
        this.CacHGD.add(HoGiaDinh);
    }
}
