import java.util.Arrays;
import java.util.Scanner;

public class LongestPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] strs = new String[size];
        for(int i = 0; i<size; i++){
            strs[i] = sc.nextLine();
        }
        System.out.println(solution(strs));
    }

    public static String solution(String[] strs){
        StringBuilder ans = new StringBuilder();
        Arrays.sort(strs);
        String a = strs[0];
        String b = strs[strs.length - 1];
        for(int i = 0; i<Math.min(a.length(),b.length()); i++){
            if(a.charAt(i) != b.charAt(i)){
                return ans.toString();
            }
            else{
                ans.append(a.charAt(i));
            }
        }
        return ans.toString();

    }
}
