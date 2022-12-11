import java.util.Scanner;

//Write a function which takes in 2 numbers and returns the greater of those two.
public class sol3{
    public static void main(String[] args) {
        System.out.println("enter the two numbers");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>=b){
            System.out.println(a + " is greater");
        }
        else if(a==b){
            System.out.println("number are equal");
        }
        else{
            System.out.println(b + " b is graeter");
        }
    }
}