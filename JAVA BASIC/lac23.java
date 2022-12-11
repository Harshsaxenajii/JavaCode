/*
print the pattern
12345
1234
123
12
1
*/
import java.util.Scanner;

public class lac23 {
    public static void main(String[] args) {
        System.out.println("Enter the number of line");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= (a-i)+1; j++) {
                System.out.print(j);
            }
            System.out.println();

        }
        
    }
}
