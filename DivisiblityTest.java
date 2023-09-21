import java.util.Scanner;
public class DivisiblityTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = countDigit(n);
        System.out.println(result);
    }

    public static int countDigit(int n){
         n = Math.abs(n);
        String num = Integer.toString(n);
        int count = 0;
        for(int i = 0; i < num.length(); i++ ){
            char digitChar = num.charAt(i);
            int digit = Character.getNumericValue(digitChar);
            if(digit != 0 && n % digit == 0){
                count++;
            }
        }
        return count;
    }
}
