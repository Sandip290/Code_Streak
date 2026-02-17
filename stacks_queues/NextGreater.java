package stacks_queues;

import java.util.Stack;

class NextGreater {
    public int[] nextGreaterElements(int[] nums) {
        int[] nge = new int[nums.length];
        Stack<Integer> st = new Stack<>();
        for (int i = 2 * nums.length - 1; i >= 0; i--) {
            int current = nums[i % nums.length];
            while (!st.empty() && st.peek() <= current) {
                st.pop();
            }
            if (i < nums.length) {
                if (st.empty()) {
                    nge[i] = -1;
                } else {
                    nge[i] = st.peek();
                }
            }
            st.push(current);
        }

        return nge;
    }
}