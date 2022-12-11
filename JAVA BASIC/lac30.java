import java.util.Scanner;

// for input included the spaces then we use the nextLine

//this is all about the string
public class lac30 {
    public static void main(String[] args) {
        // string declaration
        // String name = "Harsh";
        // String fullName = "Harsh Saxena";
        // String sen = "My name is harsh saxena";

        System.out.println("enter your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Your name is: " + name);
    }

}