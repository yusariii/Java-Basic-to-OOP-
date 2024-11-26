package BTVN2;
import java.util.*; 

@SuppressWarnings({"unchecked", "deprecation"})
public class B2 { 
    public static int Arr[] = new int[100];
    public static boolean Check[] = new boolean[100];
    public static int n;
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        Arrays.fill(Check, false);
        n = scanner.nextInt();
        tryi(0);
        scanner.close();
    }
    public static void tryi(int i){
        for (int j = 1; j <= n; j++){
                if (!Check[j]){
                    Arr[i] = j;
                    Check[j] = true;
                    if (i == n - 1){
                        printx();
                    } else {
                        tryi(i + 1);
                    }
                    Check[j] = false;
                }
            }
        }
    public static void printx(){
        for (int i = 0; i < n; i++){
            System.out.print(Arr[i] + " ");
        }
        System.out.println();
    }
}

