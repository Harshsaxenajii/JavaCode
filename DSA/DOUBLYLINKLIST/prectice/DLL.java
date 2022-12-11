public class DLL {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    public DLL(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    // PRINT LIST
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "<->");
            temp = temp.next;
        }
        System.out.print("NULL");
    }

    public void getHead() {
        System.out.println("head:" + head.value);
    }

    public void getTail() {
        System.out.println("tail:" + tail.value);
    }

    // append it the link list
    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;

    }

    // this is remove from last
    public Node removeLast() {
        // this is from initially length is zero
        Node temp = tail;
        if (length == 0) {
            return null;
        }
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        // this statement is run after the length is become 0 after the completion of
        // the above lines
        length--;
        return temp;
    }

    public void prepand(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public Node removeFirst(){
        Node temp1 = head;
        Node temp = head.next;
        if (length == 0) {
            return null;
        }
        if (length == 1) {
            head = null;
            tail = null;
        }else{
            head.next.prev = null;
            head.next = null;
            head = temp;
        }
        length --;
        return temp1;
    }

    public static void main(String[] args) {
        DLL myDll = new DLL(0);
        myDll.append(1);
        myDll.append(2);
        myDll.append(3);
        myDll.append(4);
        myDll.removeLast();
        myDll.prepand(1234);
        myDll.removeFirst();
        myDll.printList();
    }
}
