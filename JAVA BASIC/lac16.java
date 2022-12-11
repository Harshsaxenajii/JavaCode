import java.util.*;
import java.util.concurrent.CountDownLatch;
public class lac16 {
    public static void main(String[] args) {

        int sum = 0;
        System.out.println("enter the value at which the sum you want to print");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=0;i<=a;i++){
            sum = sum+i;
        }
        System.out.println(sum);

    }

}