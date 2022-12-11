public class remove_dup {
    public static void remove_dup(String str, int index, String newStr) {
        if (index == str.length()) {
            System.out.println(newStr);
            return;
        }

        char current = str.charAt(index);
        int random = 0;

        for (int i = 0; i < newStr.length(); i++) {
            if (newStr.charAt(i) == current) {
                random = 0;
                break;
            } else {
                random += 1;
            }
        }
        if (random == 0) {
            remove_dup(str, index + 1, newStr);

        } else {
            newStr += current;
            remove_dup(str, index + 1, newStr);
        }

    }

    public static void main(String[] args) {
        String str = "abbccda";
        remove_dup(str, 0, " ");
    }
}
