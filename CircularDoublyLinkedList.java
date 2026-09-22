public class CircularDoublyLinkedList {
    static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public CircularDoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void insertAtHead(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            head = newNode;
            tail = newNode;

            tail.next = head;
            head.prev = tail;
        } else {
            newNode.next = head;
            newNode.prev = tail;

            head.prev = newNode;
            tail.next = newNode;

            head = newNode;
        }
        size++;
    }

    public void insertAtTail(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            head = newNode;
            tail = newNode;

            tail.next = head;
            head.prev = tail;
        } else {
            tail.next = newNode;
            newNode.prev = tail;

            tail = newNode;

            tail.next = head;
            head.prev = tail;
        }
        size++;
    }

    public void insertAtPosition(int data, int position) {
        if (position < 1 || position > size + 1) {
            System.out.println("Invalid position !!");
            return;
        }
        if (position == 1) {
            insertAtHead(data);
            return;
        }
        if (position == size + 1) {
            insertAtTail(data);
            return;
        }

        Node prevNode = head;
        for (int i = 1; i <= position - 2; i++) {
            prevNode = prevNode.next;
        }

        Node currNode = new Node(data);
        Node nextNode = prevNode.next;

        prevNode.next = currNode;
        currNode.prev = prevNode;

        currNode.next = nextNode;
        nextNode.prev = currNode;

        size++;
    }

    public void printForward() {
        if (isEmpty()) {
            System.out.println("Linked list is empty!!");
            return;
        }
        Node temp = head;

        do {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to head)");
    }

    public void printBackward() {
        if (isEmpty()) {
            System.out.println("Empty linked list!!");
            return;
        }
        Node temp = tail;

        do {
            System.out.print(temp.data + "<->");
            temp = temp.prev;
        } while (temp != tail);
        System.out.println("(back to tail)");
    }

    public static void main(String[] args) {

    }
}
