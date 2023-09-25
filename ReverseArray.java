import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int[] reversedArray = reverseArray(n, nums);
        for(int i=0; i<n; i++){
            System.out.println(reversedArray[i] + " ");
        }
    }

    private static int[] reverseArray(int n, int[] nums) {
        int[] reversed = new int[n];

        for(int i=0; i<n; i++){
            reversed[i] = nums[n - i - 1];
        }
        return reversed;
    }
}
