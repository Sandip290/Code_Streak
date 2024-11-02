import java.util.Scanner;

public class FindMaxExponent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(maxExponent(a,b));
    }

    public static int maxExponent(int a, int b){
        int max = 0;
        int res = 0;
        for(int i = a; i<=b; i++){
            int count = findCount(i);
            if(max < count){
                max = count;
                res = i;
            }
        }
        return res;
    }

    public static int findCount(int num){
        int count = 0;
        while(num % 2 == 0 && num != 0){
            count++;
            num = num / 2;
        }
        return count;
    }
}
