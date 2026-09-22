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

    public CircularDoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    


    public static void main(String[] args) {
        
    }
}
