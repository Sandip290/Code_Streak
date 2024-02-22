import java.util.HashMap;
import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(solution(s));
    }

    public static int solution(String s){
        int sum = 0;
       HashMap<Character, Integer> m = new HashMap<>();
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);

        for(int i = 0; i<s.length(); i++){
//            This if condition checks if the current character (at index i) represents
//            a smaller value than the next character (at index i + 1). It also
//            ensures that i doesn't exceed the last index of the string to prevent
//            an IndexOutOfBoundsException
            if(i < s.length()-1 && m.get(s.charAt(i)) < m.get(s.charAt(i + 1))){
                sum -= m.get(s.charAt(i));
            }
            else{
                sum += m.get(s.charAt(i));
            }
        }
        return sum;
    }
}
