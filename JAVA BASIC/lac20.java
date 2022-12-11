import java.util.Scanner;

/*
print the pattern (lower triangal)
*
**
***
****
*/
public class lac20 {
    public static void main(String[] args) {
    System.out.println("Enter the number of lines");
    Scanner sc = new Scanner(System.in);
    int a= sc.nextInt();

        for (int j = 1; j <= a; j++) {
            for (int i = 1; i <= j; i++) {

                System.out.print("*");

            }
            System.out.println();

        }
    }
}
