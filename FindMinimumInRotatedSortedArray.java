import java.util.Scanner;

public class FindMinimumInRotatedSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(search(nums));
    }

    public static int search(int nums[]){
        int n = nums.length;
//        if( n== 1) return nums[0];
//        if (nums[n-1] < nums[n-2]) return nums[n-1];
//        if (nums[0] < nums[1] && nums[0] < nums[n-1]) return nums[0];

        int low = 0;
        int high = n-1;
        int ans = Integer.MAX_VALUE;
        while( low <= high){
            int mid = (low + high)/2;
            if(nums[low] < nums[high]){
                ans = Math.min(ans , nums[low]);
                break;
            }
             if (nums[low] <= nums[mid]){
               ans = Math.min(ans, nums[low]);
               low = mid + 1;
            }
            else{
                ans = Math.min(ans, nums[mid]);
                    high = mid-1;
            }
        }
        return ans;
    }
}
