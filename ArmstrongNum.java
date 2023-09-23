import java.util.Scanner;
public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean res = isArmstrong(n);
        System.out.println(res);
    }

    public static boolean isArmstrong(int n){
        String num = Integer.toString(n);
        int len = num.length();
        double anum =0;
        int originaln =  n;

        while (n > 0){
            int digit = n % 10;
            anum = anum + Math.pow(digit, len);
            n = n / 10;
        }
        if(originaln == anum){
            return true;
        }
        return false;
    }
}
