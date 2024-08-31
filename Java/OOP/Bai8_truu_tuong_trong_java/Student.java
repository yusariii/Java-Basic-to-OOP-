package Bai8_truu_tuong_trong_java;

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
   
    public Object Clone(){
        Student other = new Student(this.name, this.getAge(), this.height, this.UniversityName);
        return other;
    }
    // Vi age o cha co pham vi private, nen phai dung this.getAge();
}
