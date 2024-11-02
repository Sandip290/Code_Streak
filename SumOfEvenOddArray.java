import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SumOfEvenOddArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        ArrayList < Integer > even = new ArrayList<>();
        ArrayList < Integer > odd = new ArrayList<>();


        for (int i = 0; i < n; i++){
            if( i % 2 == 0){
                even.add(i);
            }
            else{
                odd.add(i);
            }
        }

        Collections.sort(even);
        Collections.sort(odd);

        System.out.println("even array:");
        for ( int i = 0; i<even.size(); i++){
            System.out.println(even.get(i));
        }

        System.out.println("odd array:");
        for ( int i = 0; i<odd.size(); i++){
            System.out.println(odd.get(i));
        }

        System.out.println(even.get(even.size() - 1));
        System.out.println(odd.get(odd.size() - 1));

        int sum = even.get(even.size() - 1) + odd.get(odd.size() - 1);
        System.out.println("the required sum:");
        System.out.println(sum);

    }
}
