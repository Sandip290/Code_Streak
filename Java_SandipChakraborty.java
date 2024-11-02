import java.util.*;
public class Java_SandipChakraborty{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int win = 0;
            int ans= 1;
            int i = 0;

            while (ans <= n) {
                win= i;
                i++;
                ans = (int) Math.pow(k, i);
            }

            System.out.println(win);
        }
    }
}

