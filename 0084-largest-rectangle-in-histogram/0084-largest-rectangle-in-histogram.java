import java.util.*;

class Solution {

    public int largestRectangleArea(int[] heights) {

        int n = heights.length;

        int[] prev = new int[n];
        int[] next = new int[n];

        Stack<Integer> st = new Stack<>();

        // Previous Smaller Index
        for (int i = 0; i < n; i++) {

            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }

            prev[i] = st.isEmpty() ? -1 : st.peek();

            st.push(i);
        }

        st.clear();

        // Next Smaller Index
        for (int i = n - 1; i >= 0; i--) {

            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }

            next[i] = st.isEmpty() ? n : st.peek();

            st.push(i);
        }

        int maxArea = 0;

        for (int i = 0; i < n; i++) {

            int width = next[i] - prev[i] - 1;

            int area = heights[i] * width;

            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }
}