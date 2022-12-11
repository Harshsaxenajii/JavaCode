// task to calculate the a^n
//with n^2 complaxity

public class tut2 {
    public static int printPow(int a,int n){
        if(a==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        int xpownm1 = printPow(a, n-1);
        int xpown = xpownm1 * a;
        return xpown;
        
    }
    public static void main(String[] args) {
        int a=2,n=5;
        System.out.println(a+"^"+n+" is equal to "+printPow(a, n));

    }
}
