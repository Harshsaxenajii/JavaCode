import java.util.ArrayList;
import java.util.Collections;

class arrayList {
    public static void main(String[] args) {
        // create the different types of list
        // Integer list
        ArrayList<Integer> list = new ArrayList<Integer>();
        // String list
        // ArrayList<String> List2 = new ArrayList<String>();
        // Boolian list
        // ArrayList<Boolean> List3 = new ArrayList<Boolean>();

        //add element
        list.add(0);
        list.add(1);
        list.add(2);
        
        //print list
        System.out.println(list);

        //get element
        int element = list.get(0);
        System.out.println(element);

        //add element in between
        list.add(1,1);
        System.out.println(list);

        //setelement
        list.set(0, 5);
        System.out.println(list);

        //delete element
        list.remove(3);
        System.out.println(list);

        //size of array list
        int size = list.size();
        System.out.println(size);

        //loops
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println();

        //sorting in arraylist
        Collections.sort(list);
        System.out.println(list);
    }
}
