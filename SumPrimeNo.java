import java.util.Scanner;
import java.util.*;

public class SumPrimeNo {
    public static void main( String[] args){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
        System.out.println(primeSum(n));
    }

    public static int primeSum(int n){
        int sum = 0;

        for (int i = 0; i<n ; i++){
            boolean isPrime = true;

            if(i <= 1){
                isPrime = false;
            }
            else{
                for(int j = 2; j <=  Math.sqrt(i); j++){
                    if(i % j == 0){
                        isPrime = false;
                        break;
                    }
                }
            }
            if(isPrime){
                sum += i;
            }
        }

        return sum;
    }
}
