import java.util.Scanner;

public class SumOfDivisibleNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("Sum of number divisible by 3 & 5 in the given range:");
        System.out.println(calculate(n,m));
    }

    public static int calculate(int n, int m){
        int sum = 0;
        for (int i = n; i< m; i++){
            if ((i %  3 == 0) && (i % 5 == 0)){
                sum = sum + i;
            }
        }
        return sum;
    }
}
