import java.util.*;

public class LL_coll {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("a");
        list.addFirst("is");

        list.addFirst("this");

        // if we use list in the place of last or first it by default last
        list.add("string");
        System.out.println(list);

        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("null");

        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

    }
}
