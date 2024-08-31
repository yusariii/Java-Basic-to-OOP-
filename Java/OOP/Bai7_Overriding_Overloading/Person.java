package Bai7_Overriding_Overloading;

public class Person {
    String name;
    private int age;
    float height;

    public Person(String name, int age, float height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void setAge(int age){
        if (age >= 0 && age <= 0){
            this.age = age;
        }
    }
    public void setAge(short age){
        if (age >= 0 && age <= 0){
            this.age = (int)age;
        }
    }
    public void setAge(long age){
        if (age >= 0 && age <= 0){
            this.age = (int)age;
        }
    }
    public void setAge(byte age){
        if (age >= 0 && age <= 0){
            this.age = (int)age;
        }
    }
    // -> Overloading, Ham duoc viet thanh nhieu ham khac nhau, khac parameter chuyen vao

    public final void getInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.height);
    }
}

