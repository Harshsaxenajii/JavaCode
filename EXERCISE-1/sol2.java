import java.util.Scanner;

//Write a function to print the sum of all odd numbers from 1 to n.
public class sol2 {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < a; i++) {
            int check = i%2;
            if(check == 1){
                sum = sum+i;
            }
        }
        int n=a/2;
        int mean = sum/n;
        System.out.println(mean);
    }    
}
