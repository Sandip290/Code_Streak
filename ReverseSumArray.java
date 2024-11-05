import java.util.Scanner;

public class ReverseSumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(sumEven(arr));
    }

    public static int sumEven(int[] arr){
        int n = arr.length;
        if(n == 0){
            return 0;
        }

        int i = 0, j = n-1;
        while(j > i){
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;
            j--;
        }

        int sum = 0;
        for(int s = 0; s<n; s++){
            if(i % 2 == 0){
                sum = sum + arr[i];
            }
        }

        return sum;
    }
}
