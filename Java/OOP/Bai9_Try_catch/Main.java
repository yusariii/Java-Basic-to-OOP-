package Bai9_Try_catch;

public class Main {
    static void inputValue(int a){
        if (a > 100){
            throw new ArithmeticException("Value > 100");
        }
    }
    // Tao ra loi moi

    public static void main(String[] args) {
        // try {
        //     int [] Arr = {1, 2, 3};
        //     System.out.println(Arr[4]);
        // } catch (Exception e) {
        //     System.out.println("Index is not exist");
        //     System.out.println("Error: " + e.toString());
        // } finally {
        //     System.out.println("This is the end");
        // }
        inputValue(102);
    }
}
