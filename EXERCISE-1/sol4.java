import java.util.Scanner;

//Write a function that takes in the radius as input and returns the circumference of a circle.

public class sol4 {
    public static void main(String[] args) {
        int b;
        float a,c;
        System.out.println("Enter the radius of the cirle");
        Scanner sc = new Scanner(System.in);
        b = sc.nextInt();
        //2pi r
        a = 2*(22/7);
        c = a*b;
        System.out.println("The circumference of the circle is "+ c);
    }    
}
