package BTVN4;

import java.util.*;

public class B2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String result = "";
        for (int i = 0; i < n; i++){
            String m = scanner.nextLine();
            int l = scanner.nextInt();
            scanner.nextLine();
            for (int j = 0; j < l; j++){
                result += m;
            }
        }
        System.out.println(result);
    }
}
