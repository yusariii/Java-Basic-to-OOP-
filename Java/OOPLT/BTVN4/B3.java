package BTVN4;

import java.util.*;

public class B3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String a = scanner.nextLine();
        int m = scanner.nextInt();
        scanner.nextLine();
        String b = scanner.nextLine();
        char[] Chuoi1 = a.toCharArray();
        char[] Chuoi2 = b.toCharArray();
        for (int i = 0; i <= n - m; i++){
            int k = 0;
            while (k < m && Chuoi2[k] == Chuoi1[i + k]) {  
                k++;
            }
            if (k == m) { 
                System.out.print(i + " ");
            }
        }
    }
}
