import java.util.Scanner;

import javax.xml.transform.Source;

//Enter 3 numbers from the user & make a function to print their average.

public class sol1 {
    public static void main(String[] args) {
        System.out.println("enter the three number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        float mean = (a+b+c)/3;
        System.out.println(mean);
    }
}