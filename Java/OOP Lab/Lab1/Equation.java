package lab1;
import java.util.Scanner;
import java.lang.Math;
public class Equation {
    public static void main(String[] args) {
        // Pt1
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a: "); 
        Double a = input.nextDouble();
        System.out.print("Enter b: "); 
        Double b = input.nextDouble();

        if(a==0) {
            if(b==0) {
                System.out.println("Phuong trinh vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        }

        System.out.println("Nghiem cua phuong trinh la: " + (0-b)/a);

        // Pt2
        System.out.print("Enter a1: ");  
        Double a1 = input.nextDouble();
        System.out.print("Enter b1: ");  
        Double b1 = input.nextDouble();
        System.out.print("Enter c1: ");  
        Double c1 = input.nextDouble();
        System.out.print("Enter a2: ");  
        Double a2 = input.nextDouble();
        System.out.print("Enter b2: ");  
        Double b2 = input.nextDouble();
        System.out.print("Enter c2: ");  
        Double c2 = input.nextDouble();
        Double d = a1*b2 - a2*b1;
        Double d1 = c1*b2 - c2*b1;
        Double d2 = a1*c2 - a2*c1;  

        if(d==0) {
            if(d1 == 0 && d2 == 0) {
                System.out.println("Phuong trinh co vo so nghiem");
            } else {
                System.out.println("Phuong trinh vo nghiem");
            }
        } else {
            System.out.println("Phuong trinh co cap nghiem duy nhat: x1 = " + d1/d + ", x2 = " + d2/d);
        }

        // Pt3
        System.out.print("Enter a: "); 
        Double a3 = input.nextDouble();
        System.out.print("Enter b: "); 
        Double b3 = input.nextDouble();
        System.out.print("Enter c: "); 
        Double c3 = input.nextDouble();
        Double delta = b3*b3 - 4*a3*c3;

        if(a3==0) {
            if(b3==0) {
                if(c3==0) {
                    System.out.println("Phuong trinh co vo so nghiem");
                } else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            } else {
                System.out.println("Phuong trinh co nghiem x = " + -c3/b3);
            }
        } else {
            if(delta<0) {
                System.out.println("Phuong trinh vo nghiem");
            } else if(delta==0) {
                System.out.println("Phuong trinh co nghiem kep x = " + -b3/2*a3);
            } else {
                System.out.println("Phuong trinh co 2 nghiem x1 = " + (-b3-Math.sqrt(delta))/2*a3 + ", x2 = " + (-b3+Math.sqrt(delta))/2*a3);
            }
        }
        input.close();
    }
}
