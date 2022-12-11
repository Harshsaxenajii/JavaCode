class LinkList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // add first
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // print list
    public void print() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.print("NULL");
        System.out.println();

    }

    // add last
    public void addLast(int data) {
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

    // delete first
    public int delFirst() {
        if (head == null) {
            System.out.println("list is empty");
            return -1;
        }
        Node del = head;
        head = head.next;
        return del.data;
    }

    //delete last
    public int delLast(){
        if (head == null) {
            System.out.println("list is empty");
            return -1;
        }
        Node currNode = head.next;
        Node targeNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
            targeNode = targeNode.next;
        }
        targeNode.next = null;
        return currNode.data;
    }

    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.addFirst(0);
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addLast(96);
        System.out.println("deleted number from first is: "+list.delFirst()); 
        System.out.println("deleted number from last is: "+list.delLast());
        list.print();
    }
}
