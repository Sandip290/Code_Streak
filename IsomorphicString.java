import java.util.Scanner;
import java.util.HashMap;

public class IsomorphicString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        System.out.println(solution(s,t));
    }

    public static boolean solution(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Character> hashMap = new HashMap<>();

        for(int i = 0; i<s.length(); i++){
            char original = s.charAt(i);
            char replacement = t.charAt(i);

            if (!hashMap.containsKey(original)) {
                if (!hashMap.containsKey(replacement)) {
                    hashMap.put(original, replacement);
                } else {
                    if (hashMap.get(replacement) == original) {
                        return true;
                    }
                    else{
                        return false;
                    }
                }
            } else {
                char mappedchar = hashMap.get(original);
                if (mappedchar == replacement) {
                    return true;
                }
                else{
                    return false;
                }
            }

        }
        return true;
        }
}

