import java.util.Scanner;

//to calculate the product of two number 
public class lac26 {
    public static int product(int a,int b){
        return a*b;
    }
    public static void main(String[] args) {
        System.out.println("enter two number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // System.out.println(a*b);
        System.out.println("the product is "+ product(a,b));
    }
}
