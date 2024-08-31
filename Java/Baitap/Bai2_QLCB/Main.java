package Bai2_QLCB;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QLCB QuanLy = new QLCB();
        while (true) {
            System.out.println("Quản lí cán bộ");
            System.out.println("Nhập 1: Thêm cán bộ vào danh sách");
            System.out.println("Nhập 2: Tìm kiếm cán bộ theo tên");
            System.out.println("Nhập 3: Hiển thị danh sách tất cả cán bộ");
            System.out.println("Nhập 4: Thoát chương trình");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    System.out.println("Nhập A: Thêm Công Nhân");
                    System.out.println("Nhập B: Thêm Kỹ Sư");
                    System.out.println("Nhập C: Thêm Nhân Viên");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "A": {
                            System.out.println("Nhập tên: ");
                            String Hoten = scanner.nextLine();
                            System.out.println("Nhập tuổi: ");
                            int Tuoi = scanner.nextInt();
                            System.out.println("Nhập giới tính: ");
                            scanner.nextLine();
                            String GioiTinh = scanner.nextLine();
                            System.out.println("Nhập địa chỉ: ");
                            String DiaChi = scanner.nextLine();
                            System.out.println("Nhập Bậc: ");
                            int Bac = scanner.nextInt();
                            scanner.nextLine();
                            Canbo CongNhanMoi = new CongNhan(Hoten, Tuoi, GioiTinh, DiaChi, Bac);
                            QuanLy.addCB(CongNhanMoi);
                            System.out.println("Đã thêm cán bộ mới: " + CongNhanMoi.toString());
                            break;
                        }
                        case "B": {
                            System.out.println("Nhập tên: ");
                            String Hoten = scanner.nextLine();
                            System.out.println("Nhập tuổi: ");
                            int Tuoi = scanner.nextInt();
                            System.out.println("Nhập giới tính: ");
                            scanner.nextLine();
                            String GioiTinh = scanner.nextLine();
                            System.out.println("Nhập địa chỉ: ");
                            String DiaChi = scanner.nextLine();
                            System.out.println("Nhập ngành đào tạo: ");
                            String NganhDaoTao = scanner.nextLine();
                            Canbo KySuMoi = new KySu(Hoten, Tuoi, GioiTinh, DiaChi, NganhDaoTao);
                            QuanLy.addCB(KySuMoi);
                            System.out.println("Đã thêm cán bộ mới: " + KySuMoi.toString());
                            break;
                        }
                        case "C": {
                            System.out.println("Nhập tên: ");
                            String Hoten = scanner.nextLine();
                            System.out.println("Nhập tuổi: ");
                            int Tuoi = scanner.nextInt();
                            System.out.println("Nhập giới tính: ");
                            scanner.nextLine();
                            String GioiTinh = scanner.nextLine();
                            System.out.println("Nhập địa chỉ: ");
                            String DiaChi = scanner.nextLine();
                            System.out.println("Nhập công việc: ");
                            String CongViec = scanner.nextLine();
                            Canbo NhanVienMoi = new NhanVien(Hoten, Tuoi, GioiTinh, DiaChi, CongViec);
                            QuanLy.addCB(NhanVienMoi);
                            System.out.println("Đã thêm cán bộ mới: " + NhanVienMoi.toString());
                            break;
                        }
                        
                        default:
                            System.out.println("Giá trị nhập vào không hợp lệ!");
                            break;
                    }
                    break;
                }
                case "2": {
                    System.out.println("Nhập tên cán bộ cần tìm: ");
                    String TenCanTim = scanner.nextLine();
                    QuanLy.findCB(TenCanTim).forEach(canbo -> {
                        System.out.println(canbo.toString());
                    });
                    break;
                }    
                case "3": {
                    QuanLy.DSCB();
                    break;
                }
                case "4": {
                    return;
                }
                
            
                default:
                    System.out.println("Giá trị nhập vào không hợp lệ, vui lòng nhập lại!");
                    continue;
            }
        }
    }
}
