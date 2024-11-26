package lab1;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang: ");
        int n = scanner.nextInt();
        int [] Arr = new int[n];
        System.out.println("Nhap tung phan tu cho mang: ");
        for (int i = 1; i <= n; i++){
            System.out.println("Phan tu thu " + i + ": ");
            int x = scanner.nextInt();
            Arr[i - 1] = x;
        }
        Arrays.sort(Arr);
        int S;
        S = 0;
        for (int i = 0; i < Arr.length; i++){
            S += Arr[i];
        }
        double d = (double) S / n;
        System.out.println("Mang da sap xep: " + Arrays.toString(Arr));
        System.out.println("Tong: " + S);
        System.out.println("Trung binh: " + d);
        scanner.close();
    }
}
