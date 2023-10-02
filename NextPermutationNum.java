
import java.util.*;
public class NextPermutationNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i =  0; i<n; i++){
            nums[i] =sc.nextInt();
        }

        nextPermutation(nums);
    }

    public static void nextPermutation(int[] nums){
        int index1=-1;
        int index2 = -1;
        for(int i = nums.length - 2; i>=0; i--){
            if(nums[i] < nums[i+1]){
                index1 = i;
                break;
            }
        }
        if(index1 == -1){
            reverse(nums, 0);
        }
        else{
            for(int i = nums.length - 1; i>= 0; i--){
                if (nums[i] > nums[index1]){
                    index2 = i;
                    break;
                }
            }
            swap(nums, index1, index2);

            reverse(nums, index1 + 1);
        }
    }
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i]= nums[j];
        nums[j] = temp;
    }

    public static void reverse(int[] nums, int start) {
        int i = start;
        int j = nums.length - 1;
        while(i < j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
}


