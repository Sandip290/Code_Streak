import java.util.Scanner;

public class RotatedArraySearch2 {
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

public static boolean search(int[] nums, int target) {
    int low = 0;
    int high = nums.length - 1;
    while (low <= high) {
        int mid = (low + high) / 2;
        if (nums[mid] == target) {
            return true;
        }
        while(low < mid && nums[low] == nums[mid]){
            low++;
        }
        while(mid < high && nums[mid] == nums[high]){
            low++;
        }

        if(nums[low] <= nums[mid]){
            if(nums[low] <= nums[target] && nums[target] < nums[mid]){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        else{
            if(nums[mid] <= nums[target] && nums[target] <= nums[high]){
                low = mid + 1;
            }
            else{
                high = mid -1 ;
            }
        }
    }
    return false;
   }
}


//another way to solve

//public class SearchRotatedArray {
//
//    public static boolean search(int[] nums, int target) {
//        int left = 0;
//        int right = nums.length - 1;
//
//        while (left <= right) {
//            int mid = (left + right) / 2;
//
//            if (nums[mid] == target) {
//                return true;
//            }
//
//            // Check if the left half is sorted
//            if (nums[left] < nums[mid]) {
//                if (nums[left] <= target && target < nums[mid]) {
//                    right = mid - 1;
//                } else {
//                    left = mid + 1;
//                }
//            }
//            // Check if the right half is sorted
//            else if (nums[left] > nums[mid]) {
//                if (nums[mid] < target && target <= nums[right]) {
//                    left = mid + 1;
//                } else {
//                    right = mid - 1;
//                }
//            }
//            // Handle the case where there are duplicates
//            else {
//                left++;
//            }
//        }
//
//        return false;
//    }
//
//    public static void main(String[] args) {
//        int[] nums = {4, 5, 6, 6, 7, 0, 1, 2, 4, 4};
//        int target = 5;
//        boolean result = search(nums, target);
//        System.out.println(result);  // Output: true
//    }
//}
