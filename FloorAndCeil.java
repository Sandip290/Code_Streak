import java.util.Scanner;
public class FloorAndCeil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] a = new int[];
        for (int i = 0; i< n; i++){
            a[i] = sc.nextInt();
        }
        ;
        System.out.println( getFloorAndCeil(a, n, x) );
    }

    public static int[] getFloorAndCeil(int[] a, int n, int x) {
        int ans = -1;
        int low = 0;
        int high = n -1;

        while(low <= high){
            int mid = (low + high)/2;

            if(a[mid] <= x){
                ans = a[mid];
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return ans, ans[mid + 1];
    }
}
