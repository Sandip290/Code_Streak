import java.util.Scanner;

public class SumBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumBinary(n));
    }

    public static int sumBinary(int n){
        int sum  = 0;
        while(n > 0){
            int lastdigit = n & 1;
            sum += lastdigit;
            n = n >> 1;

        }
        return sum;
    }
}
