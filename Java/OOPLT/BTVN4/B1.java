package BTVN4;

import java.util.Scanner;

public class B1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int n = scanner.nextInt();
        scanner.nextLine();
        String chuoi = scanner.nextLine();
        char x = scanner.next().charAt(0);
        scanner.nextLine();
        char y = scanner.next().charAt(0);
        char[] CharArray = chuoi.toCharArray();
        for (int i = 0; i < n; i++){
            if (CharArray[i] == x){
                CharArray[i] = y;
                count++;
            }
        }
        String ketQua = new String(CharArray);
        System.out.print(count);
        System.out.print(" ");
        System.out.print(ketQua);
    }
}
