import java.util.HashMap;
import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        
        //insertion
        map.put("India", 120);
        map.put("china", 160);
        map.put("us", 30);

        // print in unordered
        System.out.println(map);
        
        // put new value with same kay
        map.put("china", 180);
        System.out.println(map);

        // look up operation
        if (map.containsKey("china")) {
            System.out.println("key is here");
        }
        else{
            System.out.println("key is not here");
        }
        System.out.println(map.get("India"));  //key is in the set
        System.out.println(map.get("qwer"));   //key is not in the set

        //normal method
        int arr[] = {1,23,4};
        for (int i = 0; i < 3; i++) {
            System.out.print(arr[i]+ " ");
        }

        System.out.println();

        // advance method
        for(int val : arr){
            System.out.print(val + " ");
        }

        System.out.println();

        //method in hashmap using entry set
        for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.print(e.getKey() +" ");
            System.out.print(e.getValue());
            System.out.println();
        }

        //method to print the value using keyset
        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.print(key+ " "+map.get(key));
        }

        System.out.println();

        //remove the entry
        map.remove("china");
        System.out.println(map);
    }
}
