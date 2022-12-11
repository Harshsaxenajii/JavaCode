// time complaxity O(n)

//move the all x to end
public class move_x {
    public static void moveX(String str, int index, int count, String newStr) {
        if (index == str.length()) {
            for (int i = 0; i < count; i++) {
                newStr += 'x';
            }
            System.out.println(newStr);
            return;
        }
        char current = str.charAt(index);
        if (current == 'x') {
            count++;
            moveX(str, index + 1, count, newStr);
        } else {
            newStr = newStr + current;
            moveX(str, index + 1, count, newStr);
        }
    }

    public static void main(String[] args) {
        String str = "axbcxxd";
        moveX(str, 0, 0, "");

    }
}
