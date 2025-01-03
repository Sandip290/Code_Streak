import java.util.Scanner;

public class ProductArrayExceptSelf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(product(nums));
    }

    public static int[] product(int[] nums){
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            
        }
    }
}
