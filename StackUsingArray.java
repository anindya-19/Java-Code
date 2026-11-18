public class StackUsingArray {

    static class MyStack {

        // private data members
        private int arr[];
        private int capacity;
        private int top;

        // constructor
        public MyStack(int capacity) {
            this.capacity = capacity;
            this.arr = new int[capacity];
            this.top = -1;
        }

        // member functions
        public void push(int value) {
            if (top == capacity - 1) {
                System.out.println("Cannot push, stack overflow!!");
                return;
            }
            top++;
            arr[top] = value;
        }

        public void pop() {
            if (top == -1) {
                System.out.println("Stack underflow!!");
                return;
            }
            top--;
        }

        public int peek() {
            if (top == -1) {
                System.out.println("Empty Stack!!");
                return -1;
            }
            return arr[top];
        }

        public int getSize() {
            return top + 1;
        }

        public int getCapacity() {
            return this.capacity;
        }

        public boolean checkEmpty() {
            if (top == -1)
                return true;
            return false;
        }
    }

    public static void main(String[] args) {
        MyStack st = new MyStack(10);
        st.push(10);
        st.push(10);

        System.out.println("The size of the stack is: " + st.getSize());
    }
}
