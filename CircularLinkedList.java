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

    CircularLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }



    public static void main(String[] args) {

    }
}
