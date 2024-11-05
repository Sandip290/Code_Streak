import java.util.Scanner;

public class SmallLargeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(sum(arr, n));
    }

    public static int sum(int[] arr, int n){
        if( n < 3){
            return 0;
        }

        int secondeven = Integer.MIN_VALUE;
        int firsteven = Integer.MIN_VALUE;
        int secondodd = Integer.MIN_VALUE;
        int firstodd = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                if (arr[i] > firsteven){
                    secondeven = firsteven;
                    firsteven = arr[i];
                }
                else if(arr[i] > secondeven){
                    secondeven = arr[i];
                }
            }
            if(i % 2 != 0){
                if(arr[i] > firstodd){
                    secondodd = firstodd;
                    firstodd = arr[i];
                }
                else if(arr[i] > secondodd){
                    secondodd = arr[i];
                }
            }
        }

        return secondeven + secondeven;
    }
}
