import java.util.Scanner;

public class ReverseWordString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(solution(s));
    }

    public static String solution(String s){
       String[] sep = s.trim().split("\\s+");
       String out = "";

       for(int i = sep.length-1; i>0; i--){
           out += sep[i] + " ";
       }
       return out + sep[0];
    }
}
