package Baitap.Bai1_PhanSo;

public class Main {
    public static void main(String[] args) {
        PhanSo a = new PhanSo(1,5);
        PhanSo b = new PhanSo(3,4);
        PhanSo c = a.cong(b);
        System.out.println(a.toString() + " + " + b.toString() + " = " + c.toString());
        PhanSo d = a.tru(b);
        System.out.println(a.toString() + " - " + b.toString() + " = " + d.toString());
        PhanSo e = d.nhan(c);
        System.out.println(d.toString() + " x " + c.toString() + " = " + e.toString());
        PhanSo f = e.chia(a);
        System.out.println(e.toString() + " : " + a.toString() + " = " + f.toString());
    }
}
