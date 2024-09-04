package Bai6_QLKS.ClassPack;

public class PhongB extends Phong{
    
    public PhongB(){
        super("B", 300);
    }

    @Override
    public String toString(){
        return "Phong B, gia phong: " + GiaPhong + "$"; 
    }
}
