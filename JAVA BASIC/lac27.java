import java.util.Scanner;

//program to find the factiorial
public class lac27 {
    public static int Factorial(int n) {
        int b=1;
        for (int i = 1; i <= n; i++) {
            b=b*i;
        }
        return b;
    }
   public static void main(String[] args) {
    System.out.println("Enter the number");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    System.out.println("the factorial is "+ Factorial(a));
   } 
}