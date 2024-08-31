package Bai4_This;

public class Person {
    String name;
    int age;
    float height;

    public Person(String name){
        this.name = name;
    }

    public Person(String name, int age){
        this(name);
        this.age = age;
    }

    public Person(String name, int age, float height){
        this(name, age);
        this.height = height;
        this.getInfo();
    }

    public void getInfo(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }

    public Person getInstance(){
        return this;
    }
}
