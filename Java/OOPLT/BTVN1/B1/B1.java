package BTVN1.B1;
import java.util.*; 

@SuppressWarnings({"unchecked", "deprecation"})
public class B1 { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        int n;
        n = scanner.nextInt();
        long Tong = 0;
        for (int i = 0; i < n; i++){
            int x;
            x = scanner.nextInt();
            Tong += x;
        }
        System.out.println(Tong);
    }
}