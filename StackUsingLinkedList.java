public class StackUsingLinkedList {
    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    static class MyStack {
        private Node top;
        private int size;

        public void push(int value) {
            Node newNode = new Node(value);
            newNode.next = top;
            top = newNode;
            size++;
        }

        public int pop() {
            if (top == null) {
                throw new IllegalStateException("Stack Underflow");
            }
            int value = top.value;
            top = top.next;
            size--;
            return value;
        }

        public int peek() {
            if (top == null) {
                throw new IllegalStateException("Stack is empty!!");
            }
            return top.value;
        }

        public boolean isEmpty() {
            return top == null;
        }

        public int getSize() {
            return size;
        }

        public void printStack() {
            Node current = top;

            while (current != null) {
                IO.print(current.value + " ");
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {
        MyStack st = new MyStack();

        st.push(10);
        st.push(20);
        st.push(30);

        IO.println(st.getSize());
        IO.println(st.peek());
    }
}
