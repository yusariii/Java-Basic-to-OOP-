package Bai1;

public class Main1 {
    public static void main(String[] args) {
        Person a = new Person();
        a.name = "Khai";
        a.age = 20;
        a.height = 1.7f;
        System.out.println(a.name);
        System.out.println(a.age);
        System.out.println(a.height);

        // Mangr
        Person [] Arr = new Person[3];
        Arr[0] = new Person();
        Arr[0].name = "R9";
        Arr[0].age = 48;
        Arr[0].height = 1.83f;

        Arr[1] = new Person();
        Arr[1].name = "CR7";
        Arr[1].age = 39;
        Arr[1].height = 1.87f;
        
        Arr[2] = new Person();
        Arr[2].name = "M10";
        Arr[2].age = 36;
        Arr[2].height = 1.7f;
        for (int i = 0; i < Arr.length; i++){
            System.out.println(Arr[i].name);
        }
    }
}
