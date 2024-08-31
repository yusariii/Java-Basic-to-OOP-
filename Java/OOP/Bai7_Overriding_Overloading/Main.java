package Bai7_Overriding_Overloading;

public class Main {
    public static void main(String[] args) {
        Person a = new Person("Khai", 20, 1.7f);
        a.getInfo();
        Student b = new Student("Khai", 20, 1.73f);
        b.getInfo();
    }
}
