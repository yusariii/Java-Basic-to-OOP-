package BTVN3;
import java.util.*;

@SuppressWarnings({"unchecked", "deprecation"})
public class B1 { 
    public static final int MOD = 1000000007; 
    public static long[][] C = new long[1000][1000];
    
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();

        for (int i = 0; i <= n; i++) {
            C[0][i] = 1;
            C[i][i] = 1;
        }
        
        for (int i = 1; i <= k; i++) {
            for (int j = i; j <= n; j++) {
                C[i][j] = (C[i - 1][j - 1] + C[i][j - 1]) % MOD;
            }
        }

        long result = C[k][n];
        System.out.println(result);
    }
}
