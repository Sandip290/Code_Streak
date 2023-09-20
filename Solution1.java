//finding the sum of even and odd numbers in the given input number
import java.util.Scanner;
public class Solution1 {

    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int evennum = 0;
        int oddnum = 0;

        while(n != 0){
            int digit = n%10;
            if(digit%2 == 0){
                evennum = evennum + digit;
            }
            else{
                oddnum = oddnum + digit;
            }
            n = n/10;
        }
        System.out.println(evennum + " " + oddnum);



    }
}
