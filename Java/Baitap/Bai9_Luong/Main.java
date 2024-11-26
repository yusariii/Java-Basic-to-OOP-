package Bai9_Luong;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import Bai9_Luong.ClassPack.*;

public class Main {
    public static void main(String[] args) {
        CBGV Cbgv = new CBGV();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Quan li giao vien va luong thuong");
            System.out.println("Nhap 1: Them giao vien moi");
            System.out.println("Nhap 2: Xoa giao vien");
            System.out.println("Nhap 3: Tinh luong giao vien");
            System.out.println("Nhap 4: Hien thi thong tin tat ca giao vien");
            System.out.println("Nhap 5: Thoat chuong trinh");
            String ThaoTac = scanner.nextLine();
            switch (ThaoTac) {
                case "1":{
                    System.out.println("Ban dang them giao vien moi");
                    System.out.println("Nhap ho va ten:");
                    String HoTen = scanner.nextLine();
                    System.out.println("Nhap tuoi: ");
                    int Tuoi = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nhap que quan: ");
                    String QueQuan = scanner.nextLine();
                    System.out.println("Nhap ma so giao vien: ");
                    int MSGV = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nhap luong cung: ");
                    int LuongCung = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nhap luong thuong: ");
                    int LuongThuong = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nhap tien phat: ");
                    int TienPhat = scanner.nextInt();
                    scanner.nextLine();
                    Nguoi GVMoi = new Nguoi(HoTen, Tuoi, QueQuan, QueQuan, LuongCung, LuongThuong, TienPhat);
                    Cbgv.add(GVMoi);
                    System.out.println("Da them giao vien moi thanh cong!");
                    break;
                }
                
                case "2":{
                    System.out.println("Xoa giao vien");
                    System.out.println("Nhap ma so giao vien can xoa: ");
                    String MSGV = scanner.nextLine();
                    Cbgv.delete(MSGV);
                    System.out.println("Da xoa giao vien thanh cong!");
                    break;
                }

                case "3":{
                    System.out.println("Tinh luong giao vien");
                    System.out.println("Nhap ma so giao vien can tinh luong: ");
                    String MSGV = scanner.nextLine();
                    System.out.println("Luong cua giao vien can tinh la: " + Cbgv.TinhLuong(MSGV));
                    break;
                }

                case "4":{
                    System.out.println("Hien thi thong tin tat ca cac giao vien");
                    Cbgv.DSLuong();
                    break;
                }

                case "5":{
                    return;
                }

                default:
                    System.out.println("Gia tri nhap vao khong hop le, vui long nhap lai");
                    continue;
            }
       }

    }
}
