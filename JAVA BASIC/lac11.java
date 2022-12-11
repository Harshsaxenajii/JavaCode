import java.util.Scanner;

import javax.print.attribute.standard.MediaSizeName;

public class lac11 {
    public static void main(String[] args) {
        System.out.println("Enter the Button in between 1 - 3");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num==1) {
            System.out.println("Namastay");
        }
        else if (num == 2) {
            System.out.println("Hello");
        } else {
            System.out.println("Bonjour");
        }

    }
}
