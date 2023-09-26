import java.util.*;
public class LargestEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(largestElement(arr, n));
    }

    public static int largestElement(int[] arr, int n){
        int l = arr[0];
        for(int i = 0; i<n; i++){
            if(arr[i] > l){
                l = arr[i];
            }
        }
        return l;
    }
}
