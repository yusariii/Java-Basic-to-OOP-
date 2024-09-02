package Bai4_TuyenSinh;

import java.util.Scanner;

import Bai4_TuyenSinh.ClassPack.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TuyenSinh TuyenSinh = new TuyenSinh();
        while (true) {
            System.out.println("Quan Ly Tuyen Sinh");
            System.out.println("Nhap 1: Them thi sinh moi");
            System.out.println("Nhap 2: Hien thi thong tin cac thi sinh");
            System.out.println("Nhap 3: Tim thi sinh theo SBD");
            System.out.println("Nhap 4: Thoat khoi chuong trinh");
            String ThaoTac = scanner.nextLine();
            switch (ThaoTac) {
                case "1":{
                    System.out.println("Vui long chon khoi cho thi sinh");
                    System.out.println("Nhap A: Khoi A");
                    System.out.println("Nhap B: Khoi B");
                    System.out.println("Nhap C: Khoi C");
                    String ChonKhoi = scanner.nextLine();
                    switch (ChonKhoi) {
                        case "A":{
                            System.out.println("Nhap thong tin thi sinh");
                            System.out.println("Nhap so bao danh: ");
                            int SBD = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Nhap ho ten thi sinh: ");
                            String HoTen = scanner.nextLine();
                            System.out.println("Nhap dia chi cua thi sinh: ");
                            String DiaChi = scanner.nextLine();
                            System.out.println("Nhap muc uu tien cua thi sinh: ");
                            int MucUuTien = scanner.nextInt();
                            scanner.nextLine();
                            ThiSinh ThiSinhMoi = new KhoiA(SBD, HoTen, DiaChi, MucUuTien);
                            TuyenSinh.addTS(ThiSinhMoi);
                            System.out.println("Da them thi sinh moi. " + ThiSinhMoi.toString());
                            break;
                        }
                        case "B":{
                            System.out.println("Nhap thong tin thi sinh");
                            System.out.println("Nhap so bao danh: ");
                            int SBD = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Nhap ho ten thi sinh: ");
                            String HoTen = scanner.nextLine();
                            System.out.println("Nhap dia chi cua thi sinh: ");
                            String DiaChi = scanner.nextLine();
                            System.out.println("Nhap muc uu tien cua thi sinh: ");
                            int MucUuTien = scanner.nextInt();
                            scanner.nextLine();
                            ThiSinh ThiSinhMoi = new KhoiB(SBD, HoTen, DiaChi, MucUuTien);
                            TuyenSinh.addTS(ThiSinhMoi);
                            System.out.println("Da them thi sinh moi. " + ThiSinhMoi.toString());
                            break;
                        }
                        case "C":{
                            System.out.println("Nhap thong tin thi sinh");
                            System.out.println("Nhap so bao danh: ");
                            int SBD = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Nhap ho ten thi sinh: ");
                            String HoTen = scanner.nextLine();
                            System.out.println("Nhap dia chi cua thi sinh: ");
                            String DiaChi = scanner.nextLine();
                            System.out.println("Nhap muc uu tien cua thi sinh: ");
                            int MucUuTien = scanner.nextInt();
                            scanner.nextLine();
                            ThiSinh ThiSinhMoi = new KhoiC(SBD, HoTen, DiaChi, MucUuTien);
                            TuyenSinh.addTS(ThiSinhMoi);
                            System.out.println("Da them thi sinh moi. " + ThiSinhMoi.toString());
                            break;
                        }
                            
                        default:{
                            System.out.println("Gia tri da nhap khong hop le!");
                            break;
                        }
                    }
                    break;
                }
                case "2":{
                    System.out.println("Duoi day la thong tin cua cac thi sinh");
                    TuyenSinh.DSTS();
                    break;
                }
                case "3":{
                    System.out.println("Vui long nhap so bao danh muon tim:");
                    int SBDTS = scanner.nextInt();
                    scanner.nextLine();
                    TuyenSinh.findSBD(SBDTS).forEach(ThiSinh -> System.out.println(ThiSinh.toString()));
                    break;
                }
                case "4":{
                    System.out.println("Thoat khoi chuong trinh");
                    return;
                }
                    
                default:{
                    System.out.println("Gia tri nhap vao khong hop le, vui long nhap lai!");
                    continue;
                }
            }
        }
    }
}
