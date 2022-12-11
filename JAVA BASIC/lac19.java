import java.util.MissingFormatArgumentException;
import java.util.Scanner;

//print the pattern(hollow rectangle)
/*
*****
*   *
*   *
*****
*/
public class lac19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of row");
        int a = sc.nextInt();
        System.out.println("enter the number of coloumn");
        int b = sc.nextInt();

        for (int j = 1; j <= a; j++) {
            for (int i = 1; i <= b; i++) {
                if (i == 1 || j == 1 || i == b || j == a) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
