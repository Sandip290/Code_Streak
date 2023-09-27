import java.util.*;
public class SingleElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums){
        int result = 0;
        for(int i=0; i<nums.length; i++){
          result ^= nums[i];
        }
       return result;
    }

}
