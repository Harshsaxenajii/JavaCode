import java.util.HashSet;
import java.util.Iterator;

// this is all about the hashset 
// this is the onr kind of set

// insert - O(1)
// search - O(1)
// delete - O(1)
/**
 * heshset
 */
public class hashset {
    public static void main(String[] args) {
        // creation
        HashSet<Integer> set = new HashSet<>();

        // insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        System.out.println(set);

        // search - contains
        if (set.contains(1)) {
            System.out.println("set contains");

        }
        if (!set.contains(6)) {
            System.out.println("set not contains");
        }

        // delete
        set.remove(1);
        if (!set.contains(6)) {
            System.out.println("we delete one");
        }

        int hashsize = set.size();
        System.out.println(hashsize);

        System.out.println(set);

        System.out.println();
        // Iterator
        Iterator it = set.iterator();
        // hasnext find out any other value is exist or not after it
        // next print the next value
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}