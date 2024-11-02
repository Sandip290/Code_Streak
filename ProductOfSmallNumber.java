import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class ProductOfSmallNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("product of the element: ");
        System.out.println(findProduct(arr, sum));
    }

    public static int findProduct(int[] arr, int sum){
        ArrayList < Integer > order = new ArrayList<>();
        for (int i =0; i<arr.length; i++){
            order.add(arr[i]);
        }
        Collections.sort(order);

        if(sum > order.get(0) + order.get(1)){
            return order.get(0) * order.get(1);
        }

        return -1;
    }

}
