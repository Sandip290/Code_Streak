import java.time.temporal.ChronoField;
import java.util.Scanner;
public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s){
        if(s.isEmpty()){
            return true;
        }

        int left = 0;
        int right = s.length() - 1;

        while(left < right){
            char leftchar = s.charAt(left);
            char rightchar = s.charAt(right);

            if(!Character.isLetterOrDigit(leftchar)){
                left++;
            }
            else if(!Character.isLetterOrDigit(rightchar)){
                right--;
            }
            else{
                if(Character.toLowerCase(leftchar) != Character.toLowerCase(rightchar)){
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}
