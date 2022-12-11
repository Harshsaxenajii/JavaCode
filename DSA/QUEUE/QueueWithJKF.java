import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueWithJKF {
    public static void main(String[] args) {
        // we can use linked list and arrayDeque both nodiff between those it is base on
        // chache
        // Queue<Integer>q = new LinkedList<>();
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
