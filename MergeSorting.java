import java.util.*;
public class MergeSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i =0; i<n; i++){
            a[i] =  sc.nextInt();
        }
        int l = 0;
        int r = n-1;

        mergeSort(a, l, r);

        for(int i =0; i<n; i++) {
            System.out.print( a[i] + " ");
        }
    }

    public static void mergeSort(int[] arr, int l, int r){
        if(l<r){
            int mid = (l + r)/2;
            mergeSort(arr, l , mid);
            mergeSort(arr, mid+1, r);
            merge(arr, l, mid, r);
        }
    }

    public static void merge(int[] a, int l, int mid, int r){
        int i = l;
        int j = mid + 1;
        int k = l;
        int[] b = new int[a.length];

        while (i<= mid && j <= r){
            if(a[i] < a[j]){
                b[k] = a[i];
                i++;
            }
            else{
                b[k] = a[j];
                j++;
            }
            k++;
        }

            while(j<= r){
                b[k] = a[j];
                k++;
                j++;
            }

            while (i <= mid){
                b[k] = a[i];
                i++;
                k++;
            }

        for(k = l ; k<=r; k++){
            a[k] = b[k];
        }
    }
}
