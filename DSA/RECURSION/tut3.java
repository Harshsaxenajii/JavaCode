//X^n stach height = log(n)

public class tut3 {
    public static int printPow(int a,int n){
        if (a==0) {
            return 0;
        }
        if(n==0){
            return 1;
        }
        //even
        if (n%2==0) {
            return printPow(a, n/2) * printPow(a, n/2);
        }
        else{
            // odd
            return printPow(a, n/2) * printPow(a, n/2) * a;
        }
    }
    public static void main(String[] args) {
        int a=2,n=5;
        int ans = printPow(a, n);
        System.out.println(a+"^"+n+" is equal to "+ans);
    }
    
}