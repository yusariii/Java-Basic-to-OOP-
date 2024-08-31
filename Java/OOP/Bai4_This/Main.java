package Bai4_This;

public class Main {
    public static void main(String[] args) {
        Person a = new Person("Khai");
        Person b = new Person("Khai", 20);
        Person c = new Person("Khai", 20, 1.7f);
        System.out.println(c.getInstance());
        System.out.println(c);
    }
}
