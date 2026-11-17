import java.util.ArrayDeque;
import java.util.Deque;

public class StackUsingDeque {
    public static void main(String[] args) {
        Deque<Integer> st = new ArrayDeque<>();
        st.push(1);
        st.push(29);
        st.push(100);

        System.out.println(st);
        st.pop();
        System.out.println(st.peek());

        System.out.println(st.isEmpty());
    }
}
