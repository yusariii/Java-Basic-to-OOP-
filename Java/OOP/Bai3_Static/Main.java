package Bai3_Static;
import Bai3_Static.mypack.Person;

public class Main {
    public static void main(String[] args) {
        Person a = new Person("Khai", 20, 1.7f);
        System.out.println("So luong hoc sinh la: " + a.Total);
        Person b = new Person("Long", 20, 1.7f);
        System.out.println("So luong hoc sinh la: " + b.Total);
        Person c = new Person("Bach", 20, 1.7f);
        System.out.println("Cac hoc sinh nay la hoc sinh cua: " + Person.University);
        System.out.println("So luong hoc sinh la: " + Person.Total);

        // Person.eat(); -> Sai, can phai co static
        Person.getUniversity();
        a.getUniversity();
    }
}
