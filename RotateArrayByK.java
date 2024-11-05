import java.util.Scanner;

public class RotateArrayByK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i< n ; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        rotate(arr, n, k);

        for(int i = 0; i< n; i++){
            System.out.println(arr[i]);
        }
    }

    public static void rotate(int[] arr, int n, int k){
        for(int i =0; i<n; i++){
            swap(arr, n);
        }
    }

    public static void rotate(int[] arr, int n){
       while()
    }
}
