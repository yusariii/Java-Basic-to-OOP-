package Bai7_Overriding_Overloading;

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
    // -> Day la overriding, goi getInfo o student chu k phai person, la viet lai ham cua cha 
    // -> Khong muon overriding thi them final vao cha (Person)
}
