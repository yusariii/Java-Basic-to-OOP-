package Bai2_QLCB;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class QLCB {
    private List<Canbo> A;

    public QLCB(){
        this.A = new ArrayList<>();
    }

    public void addCB(Canbo canbo){
        this.A.add(canbo);
    }

    public List<Canbo> findCB(String Name){
        return this.A.stream().filter(o -> o.getName().contains(Name)).collect(Collectors.toList());
    }

    public void DSCB(){
        this.A.forEach(o -> System.out.println(o.toString()));
    }
}
