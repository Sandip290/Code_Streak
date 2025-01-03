import java.util.Scanner;

public class ReverseVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(reverseV(s));
    }

    public static String reverseV(String s){
       char[] temp = s.toCharArray();
       int start = 0;
       int end = temp.length - 1;
       String vowels = "aeiouAEIOU";
       while(start < end){
           while(start < end && vowels.indexOf(temp[start]) == -1){
               start++;
           }
           while(start < end && vowels.indexOf(temp[end]) == -1){
               end--;
           }

           char letter = temp[start];
           temp[start] =  temp[end];
           temp[end] = letter;

           start++;
           end--;
       }

        return String.valueOf(temp);
    }
}
