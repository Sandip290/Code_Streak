import java.util.Scanner;

public class NoDuplicateElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(search(nums));
    }

    public static int search(int nums[]){
        int n = nums.length;
        if ( n == 1){
            return nums[0];
        }
    if( nums[0] != nums[1]){
        return nums[0];
    }
    if( nums[n-1] != nums[n-2]){
        return nums[n-1];
    }

    int low = 0;
    int high = n-1;
    while(low < high){
      int mid = (low + high)/2;

        if (nums[mid - 1] != nums[mid] && nums[mid] != nums[mid + 1]) {
            return nums[mid];
        }

        if((mid%2 == 1 && nums[mid]== nums[mid-1]) || (mid%2 == 0 && nums[mid] == nums[mid + 1])){
            low = mid + 1;
        }
        else{
            high = mid - 1;
        }
    }

    return -1;
    }
}

