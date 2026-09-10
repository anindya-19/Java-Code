public class singlyLinkedList {

    static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private node head;
    private node tail;
    private int size;

    public singlyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;

    }

    public void insertAtHead(int data) {
        node newNode = new node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void insertAtTail(int data) {
        node newNode = new node(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void insertAtPosition(int position, int data) {
        if (position < 1 || position > size + 1) {
            System.out.println("Position is invalid!");
            return;
        } else if (position == 1) {
            insertAtHead(data);
            return;
        } else if (position == size + 1) {
            insertAtTail(data);
            return;
        }
        node prevNode = head;
        for (int i = 1; i < position - 1; i++) {
            prevNode = prevNode.next;
        }

        node newNode = new node(data);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
        
        size++;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }

    public void printList() {
        if(isEmpty()){
            System.out.println("The linked list is empty");
        }
        node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("NULL");
        System.out.println();
    }

    public int getSize() {
        return size;
    }

    public int getHead() {
        if (isEmpty()) {
            System.out.println("Head is empty");
            return -1;
        }
        return head.data;
    }

    public int getTail() {
        if (isEmpty()) {
            System.out.println("Tail is empty");
            return -1;
        }
        return tail.data;
    }

    public boolean search(int target){
        node temp = head;
        while(temp != null){
            if(temp.data == target){
                return true;
            }
            else{
                temp = temp.next;
            }
        }
        return false;
    }


    public static void main(String args[]) {
        singlyLinkedList myList = new singlyLinkedList();
        if(myList.isEmpty()){
            System.out.println("The linked list is empty");
        }
        myList.insertAtHead(20);    
        myList.printList();

        myList.insertAtHead(30);
        myList.insertAtHead(40);
        myList.insertAtHead(50);

        myList.insertAtTail(100);
        myList.insertAtTail(110);

        myList.insertAtPosition(1, 69);
        myList.insertAtPosition(8, 200);
        myList.insertAtPosition(3, 500);
        myList.printList();
        
        System.out.println(myList.getHead());
        System.out.println(myList.getTail());
        System.out.println(myList.search(110));
        
    }
}