package BTVN4;

import java.util.*;

public class B2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        scanner.nextLine();
        String a = scanner.nextLine();
        int n = scanner.nextInt();
        scanner.nextLine();
        String b = scanner.nextLine();
        int k = scanner.nextInt();
        int l = scanner.nextInt();
        String result = "";
        for (int i = 0; i < k; i++){
            result += a;
        }
        for (int i = 0; i < l; i++){
            result += b;
        }
        System.out.println(result);
    }
}
