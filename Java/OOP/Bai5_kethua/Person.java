package Bai5_kethua;

public class Person {
    String name;
    int age;
    float height;

    public Person(String name, int age, float height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void getInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.height);
    }
}

