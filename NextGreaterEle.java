import java.util.Stack;
public class NextGreaterEle {
    public static int[] nextGreaterElementCircular(int[] arr, int n){
        int[] res = new int[n];
        Stack <Integer> stack = new Stack<>();

        for(int i = 2*n-1; i >= 0; i--){
            while(!stack.isEmpty() && stack.peek() <= arr[i%n]){
                stack.pop();
            }
            if (i < n){
                if(!stack.isEmpty()){
                    res[i] = stack.peek();
                }
                else{
                    res[i] = -1;
                }
            }
            stack.push(arr[i%n]);
        }
        return res;
    }
}
