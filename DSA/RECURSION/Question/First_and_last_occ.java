//time complexity O(n)
public class First_and_last_occ {
    public static int first = -1;
    public static int last = -1;

    public static void print_occ(String str, int index, char ele) {
        if (index == str.length()) {
            System.out.println("first position of " + ele + " is " + first + " and last position is " + last);
            return;
        }
        char currChar = str.charAt(index);
        if (currChar == ele) {
            if (first == -1) {
                first = index;
            } else {
                last = index;
            }
        }
        print_occ(str, index + 1, ele);
    }

    public static void main(String[] args) {
        String str = "abaacdaefaah";
        print_occ(str, 0, 'a');

    }
}
