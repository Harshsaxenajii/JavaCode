import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class lac17 {
    public static void main(String[] args) {
        
        
    
        Scanner sc = new Scanner(System.in);
        int input;
        
        do {
            
            System.out.println("enter your marks out of 100");
            int marks = sc.nextInt();
            if (marks >= 90) {
                System.out.println("This is Good");
            } else if (marks >= 60) {
                System.out.println("his is also Good");
            } else {
                System.out.println("This is Good as well");
            }
            System.out.println("Do you want to continue? y(1), n(0)");
            input = sc.nextInt();
            // Scanner sc = new Scanner(System.in);

        } while (input==1);

    }
}
