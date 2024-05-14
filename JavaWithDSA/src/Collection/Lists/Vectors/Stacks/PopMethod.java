package Collection.Lists.Vectors.Stacks;

import java.util.Stack;

public class PopMethod {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push("Raj");
        st.push("Baba");
        st.push("Hero");
        st.push("Yash");
        st.push("Bhagwan");

        System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st);
        System.out.println(st.peek());
    }
}
