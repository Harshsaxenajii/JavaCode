import java.util.Scanner;

// Try to declare meaningful variables of each type. Eg - a variable named age should be a numeric type (int or float) not byte.public class lac6 
public class lac6 {

    public static void main(String[] args) {
        System.out.print("enter the radious of circle\n");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double Squre = a * a;
        double pi = 3.14;

        System.out.print("the area of circle is : ");
        double area =  pi * Squre;
        System.out.println(area);
    }
}