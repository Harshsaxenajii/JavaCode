import java.util.Scanner;

public class factorial {
    public static int fact(int a){
        if (a==1 || a==0) {
            return 1;
        }
        int fact_nm1 =  fact(a-1);
        int fact_n = a * fact_nm1;
        return fact_n;
    }

    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("the value of "+ a +"! is "+ fact(a));
    }
}
