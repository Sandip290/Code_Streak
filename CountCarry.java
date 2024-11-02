import java.util.Scanner;

public class CountCarry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(countCarry(num1, num2));
    }

    public static int countCarry(int num1, int num2){
        int count = 0;
        int carry = 0;
        int sum = 0;
        int p, q;
        while (num1 != 0 && num2 != 0){
            p = num1%10;
            q = num2%10;
            if((sum + p + q) > 9){
                count++;
                sum = sum + p + q;
                sum = sum / 10;
                carry = sum;
            }
            num1 = num1 / 10;
            num2 = num2 / 10;
        }

        while (num1 != 0 ){
            p = num1%10;
            if((sum + p) > 9){
                count++;
                sum = sum + p;
                sum = sum / 10;
                carry = sum;
            }
            num1 = num1 / 10;
        }

        while (num2 != 0){
            q = num2%10;
            if((sum + q) > 9){
                count++;
                sum = sum + q;
                sum = sum / 10;
                carry = sum;
            }
            num2 = num2 / 10;
        }

        return carry;
    }
}
