import java.util.Collections;
import java.util.PriorityQueue;

public class que1 {
    
    public static void main(String[] args) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        // return the third largest element form the queue
        pq.add(20);
        pq.add(10);
        pq.add(60);
        pq.add(30);
        pq.add(50);
        pq.add(40);
        System.out.println(pq);
        for (int i = 0; i < 2; i++) {
            pq.poll();
        }
        System.out.println("the third largest element is: "+ pq.peek());
    }
}
