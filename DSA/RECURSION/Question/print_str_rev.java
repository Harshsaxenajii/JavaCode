// time complaxity in O(n)

// public class print_str_rev {
//     public static void str_rev(String str, int index) {
//         if (index == 0) {
//             System.out.print(str.charAt(index));
//             return;
//         }

//         System.out.print(str.charAt(index));
//         str_rev(str, index - 1);

//     }

//     public static void main(String[] args) {
//         String name = "harsh";
//         str_rev(name, name.length() - 1);
//     }
// }


public class print_str_rev {
    public static void print_rev(String str, int index){
        if(index==0){
            System.out.print(str.charAt(index));
            return;
        }
       
        System.out.print(str.charAt(index));
        print_rev(str, index-1);
    }
    public static void main(String[] args) {
        String name = "harsh";
        print_rev(name, name.length()-1);
    }
    
}
