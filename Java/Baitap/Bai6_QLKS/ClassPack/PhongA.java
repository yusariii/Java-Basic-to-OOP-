package Bai6_QLKS.ClassPack;

public class PhongA extends Phong{

    public PhongA(){
        super("A", 500);
    }

    @Override
    public String toString(){
        return "Phong A, gia phong: " + GiaPhong + "$"; 
    }
}
