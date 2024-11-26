package BTVN2;
import java.util.*; 
import java.math.BigInteger;

@SuppressWarnings({"unchecked", "deprecation"})
public class B1 { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();
        String m = scanner.next();
        BigInteger num1 = new BigInteger(n);
        BigInteger num2 = new BigInteger(m);
        BigInteger Tong = num1.add(num2);
        System.out.println(Tong);
    }
}