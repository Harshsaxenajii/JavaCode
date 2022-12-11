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

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "<->");
            temp = temp.next;
        }
        System.out.print("NULL");
    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    // append in the DLL (append is always in the last of the linklist)
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

    // this is form remove form last
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

    // this is for perpend in the DLL
    public void perpend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }

    // this is form remove the first from DLL
    public Node removeFirst() {
        Node temp = head;
        if (length == 0) {
            return null;
        }
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        length--;
        return temp;
    }

    // this is get method in DLL
    public Node get(int index) {
        Node temp = head;
        if (index < 0 || index >= length) {
            return null;
        }
        if (index < length / 2) {
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }

        } else {
            temp = tail;
            for (int i = length - 1; i > index; i--) {
                temp = temp.prev;
            }
        }
        return temp;
    }

    // this is the set method
    public boolean set(int index, int value) {
        Node temp = get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    // this is the insert method
    public boolean insert(int index, int value) {
        if (index < 0 || index > length) {
            return false;
        }
        if (index == 0) {
            perpend(value);
            return true;
        }
        if (index == length) {
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node before = get(index - 1);
        Node after = before.next;
        newNode.prev = before;
        newNode.next = after;
        after.prev = newNode;
        before.next = newNode;
        length++;
        return true;
    }

    // this is the remove method in DLL
    public Node remove(int index) {
        if (index < 0 || index >= length) {
            return null;
        }
        if (index == 0) {
            return removeFirst();
        }
        if (index == length - 1) {
            return removeLast();
        }
        Node temp = get(index);
        Node after = temp.next;
        Node before = temp.prev;
        before.next = after;
        after.prev = before;
        length--;
        return temp;
    }

    // this is the main function
    public static void main(String[] args) {
        DLL myDLL = new DLL(7);
        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();
        myDLL.append(9);
        // System.out.println(myDLL.removeLast().value + " is removed");
        myDLL.perpend(12);
        myDLL.removeFirst();
        System.out.println(myDLL.get(0).value);
        System.out.println(myDLL.set(0, 9));
        myDLL.insert(2, 123);
        myDLL.remove(1);
        myDLL.printList();

    }
}
