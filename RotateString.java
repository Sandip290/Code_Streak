import java.util.Scanner;

public class RotateString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        System.out.println(solution(s, t));
    }

    public static boolean solution(String s, String goal){
        if(s.length() != goal.length()){
            return false;
        }
        if (s.isEmpty() && goal.isEmpty()){
            return true;
        }

        String combine = s + s;
        return combine.contains(goal);
    }
}
