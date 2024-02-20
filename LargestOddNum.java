import java.util.Scanner;

public class LargestOddNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(solution(s));
    }

    public static String solution(String num){
        int len = num.length();
        for(int i = len -1; i >= 0; i--){
            char a = num.charAt(i);
            int b = Character.getNumericValue(a);
            if( b%2 != 0 ){
                return (num.substring(0, i+1));
            }
        }
        return "";
    }
}
