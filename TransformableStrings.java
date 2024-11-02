import java.util.HashMap;
public class TransformableStrings {

    public static boolean canTrans(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Character> mapST = new HashMap<>();
        HashMap<Character, Character> mapTS = new HashMap<>();


        for (int i = 0; i < s.length(); i++) {
            char chars = s.charAt(i);
            char chart = t.charAt(i);

            if (mapST.containsKey(chars)) {
                if (mapST.get(chars) != chart) {
                    return false;
                }
            } else {
                mapST.put(chars, chart);
            }

            if (mapTS.containsKey(chart)) {
                if (mapTS.get(chart) != chars) {
                    return false;
                }
            } else {
                mapTS.put(chart, chars);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(canTrans("apple", "geekr"));
        System.out.println(canTrans("moo", "ban"));
        System.out.println(canTrans("moo", "kgg"));
        System.out.println(canTrans("badc", "baba"));
    }
}
