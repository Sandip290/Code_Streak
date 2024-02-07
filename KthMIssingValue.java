import java.util.Scanner;

public class KthMIssingValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(search(arr, k));
    }

    public static int search(int[] arr, int k){
        int low = 0;
        int high = arr.length - 1;
        while(low<=high){
            int mid = (low + high)/2;
            int missing = arr[mid] - (mid + 1);
            if(missing < k){
                low = mid +1;
            }
            else{
                high = mid - 1;
            }
        }
        return (low + k);
    }
}
