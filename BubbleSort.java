import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n; i++){
            arr[i] = sc.nextInt();
        }

        sorting(arr, n);

        for(int i = 0 ; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void sorting(int[] arr, int n) {
        for (int i = n - 1; i >= n; i--) {
            for (int j = 0; j <= i - 1; i++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }




}
