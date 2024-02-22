import java.util.Scanner;
import java.util.Stack;

public class MaximumNestingDepthOfParantheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(solution(s));
    }

    public static int solution(String s){
        if (s.equals("")){
            return 0;
        }
        if(s.equals("()")) {
            return 1;
        }
        int count = 0;
        int res = 0;
        for(char c : s.toCharArray()){
            if( c == '('){
                count++;
            }
            if ( c == ')' && count > 0) {
                count--;
            }
            res = Math.max(res,count);
        }
        return res;
    }
}
