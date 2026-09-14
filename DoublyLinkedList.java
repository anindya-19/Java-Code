public class DoublyLinkedList {

    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        if (size == 0) { // Linked list is empty!
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (size == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;

            tail = newNode;
        }
        size++;
    }
    public void insertAtPosition(int data, int position){
        if(position < 1 || position > size + 1){
            System.out.println("Invalid position!");
            return;
        }
        if(position == 1){
            insertAtHead(data);
            return;
        }
        if(position == size + 1){
            insertAtTail(data);
            return;
        }
        Node prevNode = head;
        for (int i = 1; i <= position - 2; i++) {
            prevNode = prevNode.next;
        }

        Node newNode = new Node(data);
        Node nextNode = prevNode.next;

        newNode.prev = prevNode;
        newNode.next = nextNode;

        nextNode.prev = newNode;

        prevNode.next = newNode;

        size++;

    }

    public static void main(String[] args) {

    }
}
