import java.util.Stack;

class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < operations.length; i++) {

            String op = operations[i];

            if (op.equals("C")) {

                st.pop();

            } else if (op.equals("D")) {

                int last = st.peek();
                st.push(2 * last);

            } else if (op.equals("+")) {

                int first = st.pop();      // top element
                int second = st.peek();    // second top element

                st.push(first);            // pehla wapas daal do
                st.push(first + second);   // sum push karo

            } else {

                st.push(Integer.parseInt(op));

            }
        }

        int sum = 0;

        while (!st.isEmpty()) {
            sum += st.pop();
        }

        return sum;
    }
}