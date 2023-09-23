import java.util.Scanner;
public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(isPrime(num)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        }
    public static boolean isPrime(int num){
        if (num <= 1) {
            return false;
        }
        if(num <= 3){
            return true;
        }
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
