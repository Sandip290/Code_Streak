import java.util.Scanner;
public class LowerBound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        lowerBound(arr, n, x);
    }

    public static int lowerBound(int[] arr,int n,int x){
        int low =0;
        int high = n-1;
        int ans = x;

        while (low <= high){
            int mid = (low + high)/2;
            if(arr[mid] >= n){
                ans = mid;
                high = mid- 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
}
