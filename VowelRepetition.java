import java.util.HashMap;

public class VowelRepetition {
    public static void main(String[] args) {
        String str = "xayuaba";
        char result = MostFrequentElement(str);
        System.out .println(result);
    }

    public static Character MostFrequentElement(String str){
        HashMap<Character, Integer> vowelCount= new HashMap<>();
        char mostFreqVowel = 'm';
        int maxcount = 0;

        for (int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowelCount.put(ch, vowelCount.getOrDefault(ch, 0) + 1);

                if(vowelCount.get(ch) > maxcount ){
                    maxcount = vowelCount.get(ch);
                    mostFreqVowel = ch;
                }
            }
        }

        return mostFreqVowel;

    }
}
