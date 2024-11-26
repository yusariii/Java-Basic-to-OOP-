package lab1;
import java.util.Scanner;
public class HeightOfStars {
    public static void main(String[] args) {
        Scanner sHeight = new Scanner(System.in);
        System.out.println("Please input height of stars: ");
        int n = sHeight.nextInt();
            for (int i = 1 ; i <= n; i++){
                for (int j = 1; j < n - i + 1; j++){
                    System.out.print(" ");
                }
                for (int j = n - i + 1; j < n + i; j++){
                    System.out.print("*");
                }
                // for (int j = n + i + 1; j <= n; j++){
                //     System.out.print(" ");
                // }
                System.out.println();
            }
        sHeight.close();
    }
}
