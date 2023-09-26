import java.util.*;

import java.util.Scanner;

public class SortedArrayorNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(check(nums));
    }

    public static boolean check(int[] nums){
        if(nums.length <= 1){
            return true;
        }

        boolean increasing = nums[0] <= nums[1];

        for(int i = 0; i < nums.length - 1; i++){
            if((increasing && nums[i] > nums[i+1] ) || (!increasing && nums[i] < nums[i + 1])){
                return false;
            }
        }

        return true;
    }


}
