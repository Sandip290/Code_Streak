// finding the nth fibonnaci number in the series
import java.util.Scanner;
public class Solution {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fibonaci = fibonaciNum(n);
        System.out.println(fibonaci);

    }

    public static int fibonaciNum(int n){
        int[] num = new int[n + 1];
        num[0] = 1;
        num[1] = 1;

        for(int i = 2; i<=n; i++){
            num[i] = num[i - 1] + num[i - 2];
        }

        return num[n - 1];
    }

}
