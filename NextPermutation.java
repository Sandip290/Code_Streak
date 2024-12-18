import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NextPermutation {
    public static void main(String[] args) {
        List<Integer>  A = Arrays.asList(new Integer[]{2,1,5,4,3});
        List<Integer> ans = nextPermutation(A);

        for(int i = 0; i<ans.size(); i++){
            System.out.print(ans.get(i) + " ");
        }
    }


    public static List<Integer> nextPermutation(List<Integer> A){
        int ind = -1;
        int n = A.size();
        for(int i = n-2; i > 0; i--){
            if(A.get(i) < A.get(i + 1)){
                ind = A.get(i);
                break;
            }
        }
        if(ind == -1){
            Collections.reverse(A);
            return A;
        }

        for(int i = n -1; i > ind; i--){
            if(A.get(i) < A.get(ind)){
                int temp = A.get(i);
                A.set(i, A.get(ind));
                A.set(i+1, temp);
            }
        }

      List <Integer> sublist = A.subList(ind+1, n-1);
        Collections.reverse(sublist);

        return A;
    }
}
