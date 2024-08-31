package Bai2_Class;
import Bai2_Class.mypack.Person;

public class Main {
    public static void main(String[] args) {
        Person a = new Person("Khai", 20, 1.7f);
        // a.name = "Khai";
        // a.age = 20;
        // a.height = 1.7f;

        int age = a.getage();
        String food = "Futa Niku";

        a.eatfood(food);
        System.out.println(a.name + " is " + age + " years old");
    }
}
