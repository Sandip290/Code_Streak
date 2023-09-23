import java.util.Scanner;
public class SumOfDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = sumOfAllDivisors(n);
        System.out.println(res);
    }

    public static int sumOfDivisor(int num){
        int sum = 0;
        for(int i = 1; i<=num; i++){
            if(num%i == 0){
                sum = sum + i;
            }
        }
        return sum;
    }

    public static int sumOfAllDivisors(int n){
        int tsum = 0;
        for(int i =1 ; i<=n; i++){
            tsum = tsum + sumOfDivisor(i);
        }
        return tsum;
    }
}
