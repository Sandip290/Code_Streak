import java.util.Scanner;
public class FindGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int res = calcGCD(n, m);
        System.out.println(res);
    }

    public static int calcGCD(int n, int m){
        if(m == 0){
            return n;
        }
        else{
            return calcGCD( m, m%n);
        }
    }
}
