import java.util.*;
public class LongestSubarray {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                System.out.println(longestSubarray(a, k));
            }
    }
    static int longestSubarray(int[] a, int k){
        int cursum = 0;
        int start = 0;
        int end = -1;

        HashMap <Integer, Integer> map = new HashMap<>();
        for(int i =0; i<a.length; i++){
            cursum += a[i];
            if(cursum-k == 0){
                start =0;
                end= i;
                break;
            }
            if(map.containsKey(cursum-k)){
                start = map.get(cursum - k) + 1;
                end = i;
                break;
            }
            map.put(cursum, i);
        }

        if(end == -1){
           return -1;
        }
        else{
            return end - start + 1;
        }
    }
}
