import java.util.Scanner;

public class RatFood {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int unit = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }


        System.out.println("the answer is: " +sufficientFoodAvailable(r, unit, n, arr));
    }

    public static int sufficientFoodAvailable(int r, int unit, int n, int[] arr){
        if(arr == null){
            return -1;
        }
        int rfood = r*unit;
        int afood = 0;
        for(int i=0; i<n; i++){
            afood += arr[i];
            if(rfood <= afood){
                return i+1;
            }
        }
        return 0;
    }
}
