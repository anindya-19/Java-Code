import java.util.ArrayDeque;
import java.util.Deque;

public class StackMiddleElement {

    public static void MiddleElementStack(Deque<Integer> st, int size, int count) {
        if (count == size / 2) {
            int middleElem = st.peek();
            System.out.println("the middle element is: " + middleElem);
            return;
        }
        st.pop();
        count++;
        MiddleElementStack(st, size, count);
    }

    public static void main(String[] args) {
        Deque<Integer> st = new ArrayDeque<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        int size = st.size();
        MiddleElementStack(st, size, 0);

    }
}
