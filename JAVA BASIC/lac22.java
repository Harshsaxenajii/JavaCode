import java.util.Scanner;

/*
print the following pattern
1
12
123
1234
12345
*/
public class lac22 {
    public static void main(String[] args) {
        System.out.println("Enter the value of the line");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int j = 1; j <= n; j++) {
            for (int i = 1; i <= j; i++) {

                System.out.print(i);

            }
            System.out.println();

        }
    }
}
