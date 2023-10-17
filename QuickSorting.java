import  java.util.*;
public class QuickSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int low = 0;
        int high = n -1 ;

        quickSort(arr, low, high);

        for(int i =0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void quickSort(int[] input, int startIndex, int endIndex){
        if (startIndex < endIndex) {
            int partition = func(input, startIndex, endIndex);
            quickSort(input, startIndex, partition - 1);
            quickSort(input, partition + 1, endIndex);
        }
    }

    public static int func(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low - 1;

        for(int j = low; j < high; j++){
            if(arr[j] < pivot){
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
