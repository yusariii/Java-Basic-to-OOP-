package Bai3_Static.mypack;
// Co static => Toan cuc, goi theo class duoc, vi du Person.Total, Person.getUniversity();
public class Person{
    // Thuộc tính
    public String name;
    public int age;
    public float height;
    public static String University = "Ha Noi University of Science and Technology";
    public static int Total = 0;

    // Phương thức
    public Person(String name, int age, float height){
        this.name = name;
        this.age = age;
        this.height = height;
        Total += 1;
    }

    public void eat(){
        System.out.println("Person is eating");
    }

    // Phuong thuc tinh~, khong the goi nhung phuong thuc, thuoc tinh non-static
    public static void getUniversity(){
        System.out.println("Ha Noi University of Science and Technology");
        //System.out.println(name); -> Sai
        //System.out.println(University); -> Dung do University la static
    }

    public void eatfood(String foodName){
        System.out.println(name + " is eating " + foodName);
    }

    public int getage(){
        return age;
    }
}