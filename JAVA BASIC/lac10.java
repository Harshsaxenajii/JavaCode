// print the condition of equal, greater, and lesser with out using else if
import java.util.*;

public class lac10 {
    public static void main(String[] args) {
        System.out.println("Enter the value of a and b");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == b) {
            System.out.println("a is equal to b");

        }
        else{
            if (a>b) {
                System.out.println("a is greater then b");
            }
            else{
                System.out.println("a is lesser then b");
            }
        }
    }
}
