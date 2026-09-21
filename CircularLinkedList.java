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

    public void printList() {
        if (size == 0) {
            System.out.println("Circular linked list is empty!!");
            return;
        }

        Node temp = head;

        do {
            System.out.print(temp.data + "->");
            temp = temp.next;
        } while (temp != head);

        System.out.println();
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

    public void insertAtPosition(int position, int data) {
        if (position < 1 || position > size + 1) {
            System.out.println("Invalid position!!");
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
        Node newNode = new Node(data);
        Node previousNode = head;

        for (int i = 1; i <= position - 2; i++) {
            previousNode = previousNode.next;
        }

        newNode.next = previousNode.next;
        previousNode.next = newNode;

        size++;

    }
    public void deleteHead(){
        if(size == 0){
            System.out.println("Empty linkedlist!!");
            return;
        }
        if(size == 1){
            head.next = null;
            head = null;
            tail = null;
            size = 0;
            return;
        }
        
        Node temp = head;
        head = head.next;

        temp.next = null;

        tail.next = head;

        size--;
    }

    public void deleteTail(){
        if(size == 0){
            System.out.println("Empty linked list!!");
            return;
        }
        if(size == 1){
            head.next = null;
            head = null;
            tail = null;
            size = 0;
            return;
        }

        Node prevNode = head;
        for (int i = 1; i <= size - 2; i++) {
            prevNode = prevNode.next;
        }

        prevNode.next = head;
        tail.next = null;
        tail = prevNode;

        size--;

    }

    public boolean search(int target) {
        if (size == 0) {
            System.out.println("empty linked list!");
            return false;
        }
        Node temp = head;
        do {

            if (temp.data == target) {
                return true;
            }

            temp = temp.next;

        } while (temp != head);

        return false;
    }

    public static void main(String[] args) {

    }
}
