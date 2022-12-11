
//pattern type question in java language
/*
1- print the pattern(solid ractangle)
*****
*****
*****
*****
*/
import java.util.Scanner;

public class lac18 {
    public static void main(String[] args) {
        // the example of nested loop
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of row\n");
        int a = sc.nextInt();
        System.out.print("enter the number of coloumn\n");
        int b = sc.nextInt();
        // outer for loop

        for (int j = 1; j <= a; j++) {
            // inner for loop
            for (int i = 1; i <= b; i++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
