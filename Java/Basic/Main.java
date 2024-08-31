package Basic;

import java.util.Random;

public class Main{
    public static void main(String[] args){
        // Biến trong java
            String name;
            float a;
            int b;
            name = "khai";
            a = 5.1f;
            b = 36;
            Random random = new Random();
            System.out.print("Ten: ");
            System.out.println(name);
            System.out.print("Chieu cao: ");
            System.out.println(a);
            System.out.print("Tuoi: ");
            System.out.println(b);
            System.out.println("khaidz");
        // Hằng trong java (thêm final trước biến)
            final double pi = 3.141596535897;
            int r = 3;
            System.out.println(r*r*pi);
        // Ép kiểu dữ liệu trong java
            // Kiểu ngầm định (Implicit): chuyển từ thằng bé sang lớn hơn, ví dụ int -> long
                int d = 5;
                long e = d;
                System.out.println(e);
            // Kiểu tường minh (Explicit): lớn hơn sang nhỏ hơn
                int f = (int) e;
                System.out.println(f);
            // Nếu ép kiểu char sang số thì ngầm định, ngược lại tường minh
                char g = 'A';
                int h = g;      //h = 65
                char i = (char) h; //i = 'A'
                System.out.println(h);
                System.out.println(i);
        // Cấu trúc rẽ nhánh
            // If... else...
                if ((int)g == 65){
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }
                int age = 24;
                if (age >= 18){
                    System.out.println("Ban da du tuoi di tu roi");
                } else {
                    System.out.println("Ban se vao trai cai tao vi thanh nien");
                }
        // Vòng lặp while, while kiểm tra điều kiện trước khi thực hiện, dowhile thực hiện rồi mới kiểm tra điều kiện
            int speed = 20;
            while (speed < 100){
                System.out.println("Toc do hien tai la: " + speed + " km/h");
                System.out.println("Toc do hop le, tiep tuc tang toc");
                speed += 10;
            }
            System.out.println("Toc do toi da, tien hanh giam toc do");
            do {
                System.out.println("Toc do hien tai la: " + speed + " km/h, tiep tuc giam");
                speed -= 10;
            } while (speed > 0);
        // Vòng lặp for
            for(int k = 0; k < 10; k++){
                System.out.println(k);
            }
        // Array
            // Mảng 1 chiều
                int [] Arr;
                Arr = new int[3];
                // Hoặc int [] Arr = new int[3];
                for (int k = 0; k < 3; k++){
                    Arr[k] = k + 3;
                    System.out.println(Arr[k]);
                }
                System.out.println(Arr);
                // In ra [I@15615099 do [I tượng trưng cho kiểu int, @... là địa chỉ lưu chữ đổi tượng
                char [] Arr2 = {'K','h','a','i'};
                System.out.println(Arr2);
                // In ra chuỗi luôn
            // Mảng 2 chiều, 2 ngoặc vuông lần lượt số hàng, số cột
                int [][] Arr3 = new int[3][3];
                for (int k = 0; k < 3; k++){
                    for (int l = 0; l < 3; l++){
                        Arr3[k][l] = random.nextInt(20);
                    }
                }
                for (int k = 0; k < 3; k++){
                    for (int l = 0; l < 3; l++){
                        System.out.print(Arr3[k][l] + " ");
                    }
                    System.out.println();
                }
        // For each
            // Kieu du lieu la kieu du lieu phan tu cua mang
            // Khong the chinh sua mang
            // Khong the tim duoc vi tri
            // Khong the chay nguoc mang
            for (int k : Arr){
                System.out.println(k);
            }
        // Break, continue
            for (int k = 0; k < Arr.length; k++){
                if (Arr[k] == 4){
                    System.out.println("Index: " + k);
                    break;
                }
            }
            int S;
            S = 0;
            for (int k = 0; k < Arr.length; k++){
                if (Arr[k] == 4){
                    continue;
                }
                S += Arr[k];
            }
            System.out.println("Total: " + S);
        // Switch case
            String gender = "boy";
            switch (gender) {
                case "boy":
                    System.out.println("You are boy");
                    break;
                case "girl":
                    System.out.println("You are girl");
                    break;
                default:
                    System.out.println("You are gay");
                    break;
            }
                
    }
}