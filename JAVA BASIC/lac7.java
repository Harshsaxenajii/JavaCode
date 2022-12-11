import java.util.Scanner;

public class lac7 {

    public static void main(String[] args) {
        System.out.println("enter the table which table you want to print");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            int val = a * i;
            System.out.println(val);
        }

    }
}