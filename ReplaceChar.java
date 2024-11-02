import java.util.Scanner;

public class ReplaceChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);

        System.out.println(str);
        System.out.println("After replace:");
        System.out.println(replace(str, a, b));
    }

    public static String replace(String str, char a, char b){
        int n = str.length();
        String res = "";
        for(int i =0; i<n; i++){
            if(str.charAt(i) == a){
                res = res + b;
            }
            else if (str.charAt(i) == b ){
                res = res + a;
            }
            else{
                res = res + str.charAt(i);
            }
        }
        return res;
    }
}
