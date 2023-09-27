import java.util.*;
public class ZeroesAtEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        moveZeroes(nums);
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void moveZeroes(int[] nums){
        int n = nums.length;
        int nonZeroIndex = 0;
        //to move the non-zero elements in the array
        for(int i =0; i<n; i++) {
               if(nums[i] != 0){
                   nums[nonZeroIndex++] = nums[i];
               }
            }
        //to add the zero elements in the end of the array
        for(int i = nonZeroIndex; i<n; i++){
            nums[i] = 0;
        }
    }

}
