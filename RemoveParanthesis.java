import java.util.*;

import java.util.Scanner;

public class RemoveParanthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(solution(s));
    }

    public static String solution(String s){
//        String result = "";
//        int count = 0;
//        for(int i = 0; i<s.length(); i++){
//            if (s.charAt(i) == '(') {
//                if (count == 0) {
//                    count++;
//                }
//                else if(count > 0){
//                    result += s.charAt(i);
//                    count++;
//                }
//            } else if (s.charAt(i) == ')') {
//                if(count == 1){
//                    count--;
//                } else if (count > 1) {
//                    result += s.charAt(i);
//                    count--;
//                }
//
//            }
//        }
//        return result.toString();

        int len = s.length();
        if(len <= 2) return "";
        char[] temp = s.toCharArray();
        StringBuilder  result = new StringBuilder();
        int count = 0;
        for(int i = 0; i<len; i++){
            if(temp[i] == '('){
                count++;
                if(count > 1) result.append(temp[i]);
            }
            else{
                if(count > 1) result.append(temp[i]);
                count--;
            }
        }
        return result.toString();
    }
}
