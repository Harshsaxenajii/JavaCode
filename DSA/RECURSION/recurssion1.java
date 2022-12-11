
public class recurssion1 {
    public static void print_num(int a){
        if(a==0){
            return;
        }
        System.out.print(a);
        print_num(a-1);

    }
    public static void main(String[] args) {
        int a=5;
        print_num(a);
    }
    
}