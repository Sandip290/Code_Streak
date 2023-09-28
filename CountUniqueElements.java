import java.util.HashSet;
import java.util.Scanner;

public class CountUniqueElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Number of distinct elements is " +countDistinct(nums));
    }

    public static int countDistinct(int[] nums){
        HashSet <Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        return set.size();
    }
}