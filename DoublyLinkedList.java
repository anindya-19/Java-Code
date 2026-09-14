public class DoublyLinkedList {

    static class Node{
        int data;
        Node next;
        Node previous;

        Node(int data){
            this.data = data;
            this.next = null;
            this.previous = null; 
        }
    }

    private Node head;
    private Node tail;
    private int size;

    DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public static void main(String[] args) {
        
    }
}
