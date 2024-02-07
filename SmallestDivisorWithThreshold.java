import java.util.Scanner;

public class SmallestDivisorWithThreshold {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(search(nums, h));
    }

    public static int search(int[] nums, int threshold){
        int low =0;
        int high = maxEle(nums);
        int ans = -1;
        while(low <= high){
            int mid = (low + high)/2;
            if( sumOfDiv(nums, mid) <= threshold){
                 ans = mid;
                high = mid -1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }

    public static int sumOfDiv(int[] nums, int mid){
        int sum = 0;
        for (int num : nums) {
            sum += Math.ceil((double) num / mid);
        }
        return sum;
    }

    public static int maxEle(int[] nums){
        int max = 0;
        for(int i =0; i< nums.length; i++){
            if (nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }

}
