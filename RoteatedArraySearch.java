import java.util.Scanner;
public class RoteatedArraySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target){
        int low = 0;
        int high = nums.length-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] >= nums[low]){
                if(target <= nums[mid] & target >= nums[low]) {
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
            else{
                if(target >= nums[mid] && target <= nums[high]) {
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
        }
        return -1 ;
    }
}
