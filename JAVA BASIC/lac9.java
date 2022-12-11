import java.util.Scanner;

public class lac9 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num1 = num % 2;
        if (num1 == 0) {
            System.out.println("The enter number is even number");
        }

        else {
            System.out.println("Enter number is odd number");
        }
    }
}
