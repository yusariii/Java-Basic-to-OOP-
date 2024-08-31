package Bai8_truu_tuong_trong_java;
// public abstract class Person{}
// -> Truu tuong hoa class, chi cac class con ke thua class cha moi su dung duoc cac ham,...
public abstract class Person {
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

    public int getAge(){
        return this.age;
    }

    public abstract Object Clone();
    // ->Phuong thuc truu tuong, chi co dinh nghia chu k co gi ben trong, bat buoc thang con phai override
    // Phuong thuc truu tuong chi dung khi class cung truu tuong

    public void getInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.height);
    }
}

