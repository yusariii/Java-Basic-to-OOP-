package Bai6_getter_setter;

public class Example {
    private int[] array;
    private Person person;

    public void setArray(int[] array){
        this.array = array.clone();
        // Neu khong dung . clone thi khi array goc thay doi thi array trong class cung thay doi
    }

    public int[] getArray(){
        return this.array.clone();
    }

    public void setPerson(Person person){
        this.person = person.clone();
    }

    public Person getPerson(){
        return this.person.clone();
    }

    public void displayArray(){
        for (int a : this.array){
            System.out.println(a);
        }
        System.out.println();
    }

    public void displayPerson(){
        this.person.getInfo();
    }
}
