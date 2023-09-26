import java.util.*;
import java.util.Arrays;
public class SecondSmallAndLarge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i<n; i++){
            a[i] = sc.nextInt();
        }
        if (n < 2) {
            System.out.println("Array should have at least two elements.");
        } else {
            int[] result = getSecondOrderElements(n, a);
            System.out.println("Second Smallest: " + result[0]);
            System.out.println("Second Largest: " + result[1]);
        }
    }

    public static int[] getSecondOrderElements(int n , int[] a){
        if(n<2) {
            return null;
        }
        int firstmin = Integer.MAX_VALUE;
        int secondmin = Integer.MAX_VALUE;
        int firstmax = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;

        for(int i = 0; i<n; i++){
            int num = a[i];

            if(num < firstmin){
                secondmin = firstmin;
                firstmin = num;
            }
            else if(num < secondmin && num!= firstmin){
                secondmin = num;
            }

            if(num > firstmax){
                secondmax =  firstmax;
                firstmax = num;
            }
            else if( num > secondmax && num!= secondmax){
                secondmax = num;
            }
        }

        int[] arr = {secondmax, secondmin};
        return arr;

    }
}
