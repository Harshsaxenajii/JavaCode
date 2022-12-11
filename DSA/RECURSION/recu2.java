
public class recu2 {
    public static void print_num(int n){
        if(n==6){
            return;
        }
        System.out.println(n);
        print_num(n+1);
    }
    public static void main(String[] args) {
        int a=1;
        print_num(a);   
    }
    
}