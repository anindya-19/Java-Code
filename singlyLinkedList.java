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
        if (isEmpty()) {
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

    public boolean search(int target) {
        node temp = head;
        while (temp != null) {
            if (temp.data == target) {
                return true;
            } else {
                temp = temp.next;
            }
        }
        return false;
    }

    public int position(int target) {
        node temp = head;
        int position = 1;
        while (temp != null) {
            if (temp.data == target) {
                return position;
            } else {
                temp = temp.next;
                position++;
            }
        }
        return -1;
    }

    public void updateAtPosition(int position, int newData) {
        if (position < 1 || position > size) {
            System.out.println("Invalid position to update linked list");
            return;
        }
        node temp = head;
        int tempPosition = 1;
        while (tempPosition != position) {
            temp = temp.next;
            tempPosition++;
        }
        temp.data = newData;

    }

    public void updateValues(int oldData, int newData) {
        node temp = head;
        while (temp != null) {
            if (temp.data == oldData) {
                temp.data = newData;
            }
            temp = temp.next;
        }
    }

    public boolean updateFirstOcuurenceValue(int oldValue, int newValue) {
        node temp = head;
        while (temp != null) {
            if (temp.data == oldValue) {
                temp.data = newValue;
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public void deleteHead() {
        if (size == 0) {
            System.out.println("The linked list is empty!!");
            return;
        }
        head = head.next;
        size--;
        if (head == null) {
            tail = null;
        }
    }

    public void deleteTail() {
        if (size == 0) {
            System.out.println("The linked list is empty");
            return;
        }
        if (size == 1) {
            head = null;
            tail = null;
            size = 0;
            return;
        }
        node temp = head;
        for (int i = 1; i <= size - 2; i++) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;

    }

    public void deleteAtPosition(int position) {
        if (position < 1 || position > size) {
            System.out.println("Invalid position !!");
            return;
        }
        if (position == 1) {
            deleteHead();
            return;
        }
        if (position == size) {
            deleteTail();
            return;
        }
        node prev = head, current;
        for (int i = 1; i <= position - 2; i++) {
            prev = prev.next;
        }
        current = prev.next;

        prev.next = current.next;
        current.next = null;

        size--;

    }

    public boolean deleteValueFirstOccurence(int target) {
        if (size == 0) {
            System.out.println("Linked list is empty, no nodes to delete!!");
            return false;
        }
        if (head.data == target) {
            deleteHead();
            return true;
        }
        node prev = head;
        node current = head.next;

        while (current != null) {
            if (current.data == target) {

                prev.next = current.next;

                if (tail == current) {
                    tail = prev;
                }
                current.next = null;
                size--;
                return true;
            }
            prev = current;
            current = current.next;
        }
        return false;
    }

    public static void main(String args[]) {
        singlyLinkedList myList = new singlyLinkedList();
        if (myList.isEmpty()) {
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

        System.out.println(myList.position(500));

        myList.updateAtPosition(9, 959);
        myList.updateAtPosition(3, 50);
        myList.updateAtPosition(6, 50);
        myList.printList();

        myList.updateValues(50, 598);
        myList.printList();

        myList.updateFirstOcuurenceValue(598, 50);
        myList.printList();
        System.out.println("After deleting head:-");
        myList.deleteHead();
        myList.printList();
        System.out.println("After deleting the last node:-");
        myList.deleteTail();
        myList.printList();
        System.out.println("The size of the linked list now: " + myList.getSize());

        myList.deleteAtPosition(4);
        myList.printList();

        myList.deleteValueFirstOccurence(40);
        myList.printList();
    }
}