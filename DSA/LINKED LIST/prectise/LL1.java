// class LL1 {
class LL1 {
    // base creation
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // add first
    public void addFirst(String data) {
        Node newNode = new Node(data);
        // base case
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // print
    public void printList() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    // delete first
    public void deleteFirst() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        head = head.next;
    }

    // delete last
    public void deleteLast() {
        if (head.next == null) {
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;

    }

    // reverse the linklist iterative approach
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

    // linked list rec
    public Node revreseRec(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = revreseRec(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    // delete the nth node form last 
    public Node nthLast(Node head, int n) {
        if (head.next==null) {
            return null;
        }
        int size = 0;
        Node curr = head;
        while (curr != null) {
            curr = curr.next;
            size = size + 1;
        }
        if(n == size){
            return head.next;
        }
        int indexToSearch = size-n;
        Node prev = head;
        int i = 1;
        while(i < indexToSearch ){
            prev = prev.next;
            i++; 
        }
        prev.next = prev.next.next;
        return head;
    }

    // main function
    public static void main(String[] args) {
        LL1 list = new LL1();
        list.addFirst("world1");
        list.addFirst("hello1");
        list.addFirst("world2");
        list.addFirst("hello2");
        list.addFirst("world3");
        list.addFirst("hello3");
        list.addFirst("world4");
        list.addFirst("hello4");
        list.deleteFirst();
        list.deleteLast();
        list.reverseIterate();
        list.head = list.revreseRec(list.head);
        list.head = list.nthLast(list.head, 3);
        list.printList();

    }

}