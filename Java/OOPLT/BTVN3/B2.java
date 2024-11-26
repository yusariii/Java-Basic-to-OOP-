package BTVN3;
import java.util.*;
public class B2 {
    public String Name;
    public int NS;
    public int NLV;
    public int Luong;
    public B2(String Name,int NS, int NLV, int Luong){
        this.Name = Name;
        this.NS = NS;
        this.NLV = NLV;
        this.Luong = Luong;
    }
    public void display() {
        System.out.print(Name + " " + NS + " " + NLV + " " + Luong + " ");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int LCN = scanner.nextInt();
        int LCB = scanner.nextInt();
        int HS = scanner.nextInt();
        int HST = scanner.nextInt();
        int Tong = 0;
        scanner.nextLine();
        B2[] Arr = new B2[n];
        for (int i = 0; i < n; i++){
            String Name = scanner.nextLine();
            int NS = scanner.nextInt();
            int NLV = scanner.nextInt();
            scanner.nextLine();
            int Tang;
            if (NLV % 5 == 0) Tang = NLV/5 - 1;
            else Tang = NLV/5;
            int Luong = LCB * (HS + Tang * HST);
            if (Luong > LCN) Luong = LCN;
            Tong += Luong;
            Arr[i] = new B2(Name, NS, NLV, Luong);
        }
        for (B2 b : Arr) {
            b.display();
        }
        System.out.println(Tong);
    }
}
