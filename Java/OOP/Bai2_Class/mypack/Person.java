package Bai2_Class.mypack;

public class Person{
    // Thuộc tính
    public String name;
    public int age;
    public float height;

    // Phương thức
    public Person(String name, int age, float height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void eat(){
        System.out.println("Person is eating");
    }

    public void eatfood(String foodName){
        System.out.println(name + " is eating " + foodName);
    }

    public int getage(){
        return age;
    }
}