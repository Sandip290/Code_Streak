import java.util.Scanner;

public class IncreasingTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println(triplets(nums));
    }

    public static boolean triplets(int[] nums){
        int n1 = Integer.MAX_VALUE;
        int n2 = Integer.MAX_VALUE;
        for(int num : nums){
            if(num <= n1){
                n1 = num;
            }
            else if(num <= n2){
                n2 = num;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
