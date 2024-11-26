package lab1;

import java.util.Scanner;

public class AddTwoArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so hang cua ma tran: ");
        int n = scanner.nextInt();
        System.out.println("Nhap so cot cua ma tran: ");
        int m = scanner.nextInt();
        int [][] Arr1 = new int[n][m];
        int [][] Arr2 = new int[n][m];
        int [][] Arr3 = new int[n][m];
        System.out.println("Nhap ma tran thu nhat: ");
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= m; j++){
                System.out.println("Nhap phan tu hang " + i + " cot " + j + ":");
                int x = scanner.nextInt();
                Arr1[i-1][j-1] = x;
            }
        }
        System.out.println("Nhap ma tran thu hai: ");
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= m; j++){
                System.out.println("Nhap phan tu hang " + i + " cot " + j + ":");
                int x = scanner.nextInt();
                Arr2[i-1][j-1] = x;
            }
        }
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= m; j++){
                Arr3[i-1][j-1] = Arr1[i-1][j-1] + Arr2[i-1][j-1];
            }
        }
        System.out.println("Tong hai ma tran: ");
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= m; j++){
                System.out.print(Arr3[i-1][j-1] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
