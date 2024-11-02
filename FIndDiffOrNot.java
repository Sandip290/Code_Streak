import java.util.Scanner;
import java.util.*;

public class FIndDiffOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int num = sc.nextInt();
        int diff = sc.nextInt();

        System.out.println(findCount(arr, num, diff));

    }

    public static int findCount(int[] arr, int num, int diff){
        int count = 0;
        for (int i = 0; i< arr.length; i++){
            if(Math.abs(num - arr[i]) <= diff){
                count++;
            }
        }
        if(count > 0){
            return count;
        }
        return 0;
    }
}
