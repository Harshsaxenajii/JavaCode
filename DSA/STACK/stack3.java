import java.util.*;
public class stack3 {
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }

    }

    static class stack {
        public static Node head = null;

        // push
        public static void push(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public static Boolean isEmpty() {
            return head == null;
        }

        // peek
        public static int peek() {
            if (!isEmpty()) {
                return -1;
            }
            Node top = head;
            return top.data;

        }

        // pop
        public static int pop() {
            if (!isEmpty()) {
                return -1;
            }
            Node top = head;
            head = head.next;
            return top.data;
        }

    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            stack.pop();
        }

    }

}