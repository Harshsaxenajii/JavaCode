import java.util.Scanner;

public class lac21 {
    public static void main(String[] args) {
        System.out.println("Enter the number of line");
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        
        for (int j = 1; j <= a; j++) {
            for (int i = 1; i <= (a-j)+1; i++) {

                System.out.print("*");

            }
            System.out.println();

        }
    }
}
