package Bai5_QLKP;

import Bai5_QLKP.ClassPack.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        KhuPho KhuPho = new KhuPho();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so ho gia dinh:");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 1; i <= n; i++){
            System.out.println("Nhap thong tin cua gia dinh thu " + n);
            System.out.println("Nhap dia chi:");
            String SoNha = scanner.nextLine();

            List<Nguoi> ThanhVien = new ArrayList<>();
            System.out.println("Nhap so thanh vien:");
            int j = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Nhap thong tin cua cac thanh vien");
            for (int k = 1; k <= j; k++){
                System.out.println("Nhap thong tin thanh vien thu " + k);
                System.out.println("Ho va ten:");
                String HoTen = scanner.nextLine();
                System.out.println("Tuoi:");
                int Tuoi = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Nghe nghiep:");
                String NgheNghiep = scanner.nextLine();
                System.out.println("So CMND:");
                int SoCMND = scanner.nextInt();
                scanner.nextLine();
                Nguoi A = new Nguoi(HoTen, Tuoi, NgheNghiep, SoCMND);
                ThanhVien.add(A);
            }
            KhuPho.addHGD(new HoGiaDinh(ThanhVien, SoNha));
        }
    }
}
