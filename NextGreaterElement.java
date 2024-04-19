import java.util.Stack;

public class NextGreaterElement {
    public static int[] nextGreaterElement(int[] arr, int n) {
        // Write your code here.
        int[] nge = new int[n];
        Stack <Integer> st = new Stack<>();
        for (int i = 2 * n - 1; i >= 0; i--){
            while(!st.empty() && st.peek() <= arr[i%n]){
                st.pop();
            }
            if (i < n){
                if (!st.isEmpty()) nge[i] = st.peek();
                else nge[i] = -1;
            }
            st.push(arr[i%n]);
        }
        return nge;
    }
}
