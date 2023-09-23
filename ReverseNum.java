import java.util.Scanner;
public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = reverse(n);
        System.out.println(res);
    }

    public static int reverse(int n){
        long rev = 0;
        while(n != 0){
            int digit = n%10;
            rev = rev + digit;
            rev = rev * 10;
            n = n/10;
        }
        rev = rev/10;
        if(rev > Integer.MAX_VALUE || rev<Integer.MIN_VALUE){
            return 0;
        }
        if(n<0){
            return (int)(-1*rev);
        }
        return (int)rev;
    }
}
