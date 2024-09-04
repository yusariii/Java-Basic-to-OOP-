package Bai6_QLKS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Bai6_QLKS.ClassPack.*;

public class Main {
    public static void main(String[] args) {
        QLKS QuanLy = new QLKS();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Quan li khach san");
            System.out.println("Nhap 1: Them nguoi thue moi");
            System.out.println("Nhap 2: Xoa nguoi thue");
            System.out.println("Nhap 3: Tinh tien thue");
            System.out.println("Nhap 4: Xem thong tin tat ca nguoi thue");
            System.out.println("Nhap 5: Thoat");
            String ThaoTac = scanner.nextLine();
            switch (ThaoTac) {
                case "1":{
                    System.out.println("Nhap thong tin nguoi thue moi");
                    System.out.println("Ho va ten: ");
                    String HoTen = scanner.nextLine();
                    System.out.println("Tuoi:");
                    int Tuoi = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("So Chung minh Nhan Dan:");
                    int SoCMND = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nhap A de chon phong A");
                    System.out.println("Nhap B de chon phong B");
                    System.out.println("Nhap C de chon phong C");
                    String LoaiPhong = scanner.nextLine();
                    Phong phong;
                    switch (LoaiPhong) {
                        case "A":{
                            phong = new PhongA();
                            break;
                        }
                        case "B":{
                            phong = new PhongB();
                            break;
                        }
                        case "C":{
                            phong = new PhongC();
                            break;
                        }
                    
                        default:
                            continue;
                    }
                    System.out.println("So ngay thue:");
                    int SoNgayThue = scanner.nextInt();
                    scanner.nextLine();
                    Nguoi NguoiThueMoi = new Nguoi(HoTen, Tuoi, SoCMND, phong, SoNgayThue);
                    QuanLy.add(NguoiThueMoi);
                    System.out.println("Da them thanh cong!");
                    break;
                }

                case "2":{
                    System.out.println("Nhap so Chung minh Nhan Dan nguoi thue can xoa:");
                    int SoCMND = scanner.nextInt();
                    scanner.nextLine();
                    QuanLy.delete(SoCMND);
                    System.out.println("Da xoa thanh cong!");
                    break;
                }

                case "3":{
                    System.out.println("Nhap so Chung minh Nhan Dan nguoi can tinh tien thue:");
                    int SoCMND = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Tien thue cua khanh hang " + SoCMND + " la : " + QuanLy.TinhTien(SoCMND));
                    break;
                }

                case "4":{
                    QuanLy.DSThue();
                    break;
                }

                case "5":{
                    return;
                }
                    
                default:
                    System.out.println("Nhap sai thao tac");
                    continue;
            }
        }
    }
}
