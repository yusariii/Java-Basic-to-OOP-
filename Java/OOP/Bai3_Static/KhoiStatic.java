package Bai3_Static;
//Bien toan cuc cua class KhoiStatic, Khối static sẽ chạy trước sau đó mới đến main chạy
public class KhoiStatic {
    static String Course;
    // static {
    //     System.out.println("Cau lenh nay se chay truoc ");
    //     Course = "Java from Basic to OOP";
    // }

    public static void main(String[] args) {
        System.out.println("Day la khoa hoc: " + KhoiStatic.Course);
    }
    static {
        System.out.println("Cau lenh nay se chay truoc ");
        Course = "Java from Basic to OOP";
    }
}