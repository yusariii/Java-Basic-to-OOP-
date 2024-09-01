package Bai3_QLTV;

import java.util.Scanner;

import Bai3_QLTV.ClassPack.Bao;
import Bai3_QLTV.ClassPack.Sach;
import Bai3_QLTV.ClassPack.TaiLieu;
import Bai3_QLTV.ClassPack.TapChi;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuanLySach QLTV = new QuanLySach();

        while (true) {
            System.out.println("Quan li thu vien");
            System.out.println("Nhap 1: Them moi tai lieu");
            System.out.println("Nhap 2: Xoa tai lieu");
            System.out.println("Nhap 3: Hien thi thong tin tai lieu");
            System.out.println("Nhap 4: Tim kiem loai tai lieu");
            System.out.println("Nhap 5: Thoat chuong trinh");
            String ThaoTac = scanner.nextLine();
            switch (ThaoTac) {
                case "1":{
                    System.out.println("Them moi tai lieu");
                    System.out.println("Nhap A: Them moi sach");
                    System.out.println("Nhap B: Them moi tap chi");
                    System.out.println("Nhap C: Them moi bao");
                    String ThemTaiLieu = scanner.nextLine();
                    switch (ThemTaiLieu) {
                        case "A":{
                            System.out.println("Nhap ma tai lieu:");
                            int MaTaiLieu = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Nhap ten Nha xuat ban:");
                            String NXB = scanner.nextLine();
                            System.out.println("Nhap so ban phat hanh:");
                            int SoBanPhatHanh = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Nhap ten tac gia:");
                            String TenTG = scanner.nextLine();
                            System.out.println("Nhap so trang sach:");
                            int SoTrang = scanner.nextInt();
                            scanner.nextLine();
                            TaiLieu SachMoi = new Sach(MaTaiLieu, NXB, SoBanPhatHanh, TenTG, SoTrang);
                            QLTV.addTL(SachMoi);
                            System.out.println("Da them sach moi: " + SachMoi.toString());
                            break;
                        }
                        
                        case "B":{
                            System.out.println("Nhap ma tai lieu:");
                            int MaTaiLieu = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Nhap ten Nha xuat ban:");
                            String NXB = scanner.nextLine();
                            System.out.println("Nhap so ban phat hanh:");
                            int SoBanPhatHanh = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Nhap so phat hanh:");
                            int SoPhatHanh = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Nhap thang phat hanh:");
                            int ThangPhatHanh = scanner.nextInt();
                            scanner.nextLine();
                            TaiLieu TapChiMoi = new TapChi(MaTaiLieu, NXB, SoBanPhatHanh, SoPhatHanh, ThangPhatHanh);
                            QLTV.addTL(TapChiMoi);
                            System.out.println("Da them tap chi moi: " + TapChiMoi.toString());
                            break;
                        }
                            
                        case "C":{
                            System.out.println("Nhap ma tai lieu:");
                            int MaTaiLieu = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Nhap ten Nha xuat ban:");
                            String NXB = scanner.nextLine();
                            System.out.println("Nhap so ban phat hanh:");
                            int SoBanPhatHanh = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Nhap ngay phat hanh:");
                            int NgayPhatHanh = scanner.nextInt();
                            scanner.nextLine();
                            TaiLieu BaoMoi = new Bao(MaTaiLieu, NXB, SoBanPhatHanh, NgayPhatHanh);
                            QLTV.addTL(BaoMoi);
                            System.out.println("Da them bao moi: " + BaoMoi.toString());
                            break;
                        }
                    
                        default:{
                            System.out.println("Gia tri da nhap khong phu hop!");
                            break;
                        }
                    }
                    break;
                }
                case "2":{
                    System.out.println("Xoa tai lieu theo ma tai lieu");
                    System.out.println("Nhap ma tai lieu can xoa: ");
                    int MTLXoa = scanner.nextInt();
                    scanner.nextLine();
                    QLTV.XoaTaiLieu(MTLXoa);
                    System.out.println("Da xoa tai lieu co ma tai lieu: " + MTLXoa);
                    break;
                }
                case "3":{
                    QLTV.DSTL();
                    break;
                }
                case "4":{
                    System.out.println("Tim kiem lai lieu theo loai");
                    System.out.println("Nhap S: Tim sach");
                    System.out.println("Nhap T: Tim tap chi");
                    System.out.println("Nhap B: Tim bao");
                    String LoaiTaiLieu = scanner.nextLine();
                    switch (LoaiTaiLieu) {
                        case "S":{
                            QLTV.TimSach();
                            break;
                        }
                        case "T":{
                            QLTV.TimTapChi();
                            break;
                        }
                        case "B":{
                            QLTV.TimBao();
                            break;
                        }
                        
                        default:{
                            System.out.println("Gia tri da nhap khong hop le!");
                            break;
                        }     
                    }
                    break;
                }
                case "5":{
                    return ;
                }    
            
                default:
                    System.out.println("Gia tri da nhap khong lop le, vui long nhap lai!");
                    continue;
            }
        }
    }
}
