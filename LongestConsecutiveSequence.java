import java.lang.reflect.Array;
import java.util.*;
public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i =  0; i<n; i++){
            nums[i] =sc.nextInt();
        }

        System.out.println(longestConsecutive(nums));
    }

    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return -1;
        }
        Arrays.sort(nums);
        int count = 0;
        int longest = 1;
        int n = nums.length;
        int lastsmaller = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (nums[i] == lastsmaller) {
                count += 1;
                lastsmaller = nums[i];
            } else if (nums[i] != lastsmaller) {
                count = 1;
                lastsmaller = nums[i];
            }
            longest = Math.max(count, longest);
        }
        return longest;
    }
}
