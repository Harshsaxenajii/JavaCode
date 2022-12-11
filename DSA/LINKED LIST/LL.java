// linklist form skretch for understand the linklist

class LL {
    Node head;
    private int size;

    LL() {
        this.size = 0;
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add - first
    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // add - last
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    // print
    public void printList() {
        if (head == null) {
            System.out.print("list is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.print("NULL");
    }

    // delete first
    public void deleteFirst() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    // delete last
    public void deleteLast() {

        if (head.next == null) {
            head = null;
            return;
        }
        size--;

        Node secondLast = head;
        Node lastNode = head.next; // head.next = null -> lastNode = null
        while (lastNode.next != null) { // null.next = error
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    public int getSize() {
        return size;
    }

    // reverse the linked list
    public void reverseIterate() {
        if (head == null || head.next == null) {
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            // update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;

    }

    public Node reverseRec(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = reverseRec(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();

        System.out.println();

        list.addLast("List");
        list.printList();

        System.out.println();

        list.addFirst("this");
        list.printList();

        System.out.println();

        list.deleteFirst();
        list.printList();

        System.out.println();

        list.deleteLast();
        list.printList();

        System.out.println();

        // size of list
        System.out.println(list.getSize());

        // reverse of linkedlist
        list.reverseIterate();
        list.printList();

        System.out.println();

        // reverse of linkedlist by rec approach
        list.head = list.reverseRec(list.head);
        list.printList();
    }

}