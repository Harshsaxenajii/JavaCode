// this is all about if, else if, else statement
import java.util.*;

import javax.lang.model.util.ElementFilter;

//this is all about the conditional statement
public class lac8 {
    public static void main(String[] args) {
        System.out.println("enter your age");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a>18) {
            System.out.println("Nice! you are adult\n");

        }
        else if(a==18){
            System.out.println("you are just adult now\n");
        }
        else{
            System.out.println("you are a junior\n");
        }
    }
}
