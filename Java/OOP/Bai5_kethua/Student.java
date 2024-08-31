package Bai5_kethua;

public class Student extends Person {
    public String UniversityName;
    public Student(String name, int age, float height){
        super(name, age, height);
    }

    public Student(String name, int age, float height, String UniversityName){
        this(name, age, height);
        this.UniversityName = UniversityName;
    }

    public void getInfo(){
        super.getInfo();
        System.out.println(this.UniversityName);
    }
    //Super dung de goi phuong thuc co o cha
}
