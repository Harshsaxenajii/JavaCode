import java.util.Scanner;

public class lac12 {
    public static void main(String[] args) {
        System.out.println("Enter the button in between 1 - 3");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a) {
            case 1:
                System.out.println("Hello");
                break;

            case 2:
                System.out.println("Namastay");
                break;

            case 3:
                System.out.println("Bonjour");
                break;

            default:
                System.out.println("key not specify");
                break;
        }
    }
}
