import java.util.*;
public class AlternateNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i =0; i<n; i++){
            a[i] = sc.nextInt();
        }

    }

    public  static int[] alternateNumbers(int[] a){
        int[] arr =  new int[a.length];
        int evenindex = 0;
        int oddindex = 1;
        for(int i = 0; i<a.length; i++){
            if(a[i] > 0){
                arr[evenindex] = a[i];
                evenindex += 2;
            }
            else{
                arr[oddindex] = a[i];
                oddindex += 2;
            }
        }
        return arr;
    }
}
