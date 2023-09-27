import java.util.*;
public class MergingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        List< Integer > mergedList = sortedArray(a,b);
        System.out.print(mergedList);
    }

    public static List < Integer > sortedArray(int[] a, int[] b){
        List<Integer> mergedList = new ArrayList<>();
        int i =0 ,j =0;
        while( i<a.length && j<b.length){
            if(a[i] < b[j]){
                mergedList.add(a[i]);
                i++;
            }
            else{
                mergedList.add(b[j]);
                j++;
            }
        }

        while(i < a.length){
            mergedList.add(a[i]);
            i++;
        }

        while(j < b.length){
            mergedList.add(b[j]);
            j++;
        }

        return mergedList;
    }
}
