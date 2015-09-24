package Lafore_Stack;

public class StackTest {

    public static void main(String[] args) {
        Stack st = new Stack(10);
        st.push(20);
        st.push(30);
        st.push(60);
        st.push(80);
        while (!st.isEmpty()) {
            long value = st.pop();
            System.out.print(value);
            System.out.print(" ");
        }
        System.out.println("");
    }
}
