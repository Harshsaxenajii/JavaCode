import java.util.Scanner;

/*
    this is all about the bit manipulation
    1- get 
    2- set
    3- clear
    4- update
 */
public class lac35 {
    public static void main(String[] args) {

        int n = 5; // 0101
        int pos = 2;
        int bitMask = 1 << pos;
        
        //input for the get you want update with 0 or 1
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();


        // this is the program for the get bit
        if ((bitMask & n) == 0) {
        System.out.println("bit was zero");
        } else {
        System.out.println("bit was one");
        // }

        // this is the program for the set bit
        // int newNumber = bitMask|n;
        // System.out.println(newNumber);

        // this is the program for the clear bit
        int newnumber = ~bitMask;
        int newnumber2 = newnumber&n;
        System.out.println(newnumber2);

        // this is the program for the update
        // 1-if we want to make the required position 0 then we use the clear bit
        // program
        // 2-if we want to make the requires position 1 then we use the set bit program
        if (a == 0) {
            int newnumber = ~bitMask;
            int newnumber2 = newnumber & n;
            System.out.println(newnumber2);
        } else {
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }
    }

}