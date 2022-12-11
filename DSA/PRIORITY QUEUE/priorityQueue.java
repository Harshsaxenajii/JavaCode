import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class priorityQueue {

    public static void main(String[] args) {
        // follow min heap
        // if we want max help then we use in the constractor "Collections.reverseOrder()"
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(1);
        pq.add(2);
        pq.add(3);
        pq.add(4);
        System.out.println(pq);
        while (!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.poll();
        }
    }

}