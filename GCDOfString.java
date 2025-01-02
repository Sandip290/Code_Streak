import java.util.Scanner;

public class GCDOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println(gcdString(str1, str2));
    }

    public static String gcdString(String str1, String str2){
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }
        int gcdlen = gcd(str1.length(), str2.length());
        return str1.substring(0, gcdlen);
    }

    public static int gcd(int len1, int len2){
        while(len2 != 0){
            int temp = len1 % len2;
            len1 = len2;
            len2 = temp;
        }
        return len1;
    }
}
