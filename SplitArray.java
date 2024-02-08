import java.util.Scanner;

public class SplitArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(search(nums, k));
    }


    public static int search(int[] nums, int k){
        int low = max(nums);
        int high = sum(nums);
        while(low <= high){
            int mid = (low + high)/2;
            int no_student = pagescount(nums, mid);
            if(no_student > k){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return low;
    }

    public static int pagescount(int[] nums, int pages){
        int count = 1;
        int pagescount = 0;
        for (int i = 0; i < nums.length; i++){
            if ( pagescount + nums[i] <= pages){
                pagescount += nums[i];
            }
            else{
                count++;
                pagescount = nums[i];
            }
        }
        return count;
    }

    public static int sum(int[] nums){
        int tsum = 0;
        for(int i = 0; i < nums.length; i++){
            tsum += nums[i];
        }
        return tsum;
    }

    public static int max(int[] nums){
        int m = nums[0];
        for(int i = 0; i < nums.length; i++){
            if(m < nums[i]){
                m = nums[i];
            }
        }
        return m;
    }
}
