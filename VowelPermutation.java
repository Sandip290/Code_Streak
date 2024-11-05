import java.util.HashSet;
import java.util.Scanner;

public class VowelPermutation {

    public static void main( String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(permutation(s));
    }

    public static int permutation(String s){
        HashSet<Character> vowels = new HashSet<>();
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');


        int notVowel = 0;
        for(int i = 0; i < s.length(); i++){
            if(!vowels.contains(s.charAt(i))){
                notVowel++;
            }
        }
        return factorial(notVowel);
    }

    public static int factorial(int n){
        if( n == 0 || n == 1){
            return 1;
        }
        int ans = 2;
        for(int i = 2; i < n ; i++){
            ans *= i;
        }
        return ans;
    }
}
