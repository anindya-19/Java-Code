public class CircularLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void insertAtHead(int data) {

        Node newNode = new Node(data);

        if (size == 0) {
            head = newNode;
            tail = newNode;

            tail.next = head;
        } else {
            newNode.next = head;
            head = newNode;

            tail.next = head;
        }
        size++;
    }

    public void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (size == 0) {
            head = newNode;
            tail = newNode;

            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;

            tail.next = head;
        }
        size++;
    }

    public static void main(String[] args) {

    }
}
