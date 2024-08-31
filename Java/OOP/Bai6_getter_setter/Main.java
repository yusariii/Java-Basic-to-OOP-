package Bai6_getter_setter;

public class Main {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        Example b = new Example();
        Person c = new Person("Khai", 20, 1.7f);
        b.setArray(a);
        b.setPerson(c);
        b.displayArray();
        b.displayPerson();
    }
}
