class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int cur = 0;
        int max = 0;  // Initialize max to 0 instead of Integer.MIN_VALUE since area can't be negative

        for (int i = 0; i < heights.length; i++) {
            // While stack is not empty and the current height is less than the height of the top of the stack
            while (!st.empty() && heights[st.peek()] > heights[i]) {
                int pops = st.pop();  // Pop the top index
                if (st.empty()) {
                    cur = heights[pops] * i;  // If stack is empty, width is from 0 to i
                } else {
                    cur = heights[pops] * (i - (st.peek() + 1));  // Width is between the new top of the stack and i
                }
                max = Math.max(cur, max);  // Update max area
            }
            st.push(i);  // Push current index to the stack
        }

        // Handle remaining elements in the stack
        while (!st.empty()) {
            int pops = st.pop();
            if (st.empty()) {
                cur = heights[pops] * heights.length;  // If stack is empty, width is from 0 to end of the array
            } else {
                cur = heights[pops] * (heights.length - (st.peek() + 1));  // Width is between the new top of the stack and end of the array
            }
            max = Math.max(cur, max);  // Update max area
        }

        return max;
    }
}
