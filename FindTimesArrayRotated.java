import java.util.Scanner;

public class FindTimesArrayRotated {

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

        int low = 0;
        int high = n-1;
        int ans = Integer.MAX_VALUE;
        int index = -1;
        while( low <= high){
            int mid = (low + high)/2;
            if(nums[low] < nums[high]){
               if(nums[low] < ans){
                   index = low;
                   ans = nums[low];
               }
            }
            if (nums[low] <= nums[mid]){
                if(nums[low] < ans){
                    index = low;
                    ans = nums[low];
                }
            }
            else{
                if(nums[mid] < ans){
                    index = mid;
                    ans = nums[mid];
                }
            }
        }
        return index;
    }
}
