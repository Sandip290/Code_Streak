import java.util.Scanner;

public class FindProductPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int sum = sc.nextInt();


        System.out.println(productSmallestPair(arr, n, sum));
    }

    public static  int productSmallestPair(int[] arr, int n, int sum){
        if(n<2){
            return -1;
        }
        int temp;
        for(int i =0; i<n; i++){
            for(int j = i + 1; j<n; j++){
                if(arr[i] > arr[j]){
                   temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
                }
            }
        }
        for(int i =0; i<n; i++){
            if((arr[i] + arr[i + 1]) <= sum ){
                return arr[i] * arr[i + 1];
            }
        }
        return 0;
    }
}
