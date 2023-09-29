import java.util.*;
public class MaximumSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxSubarraySum(arr, n));
    }
// THIS IS KNOWN AS KADANE'S ALGORITHM
    public static long maxSubarraySum(int[] arr, int n){
        int cursum = 0;
        int maxsum = 0;
        for(int i = 0; i<n; i++){
            cursum =  cursum + arr[i];
            if(cursum > maxsum){
                maxsum = cursum;
            }
            if(cursum < 0){
                cursum = 0;
            }
        }
        return maxsum;
    }
}
