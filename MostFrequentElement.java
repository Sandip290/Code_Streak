import java.util.*;
public class MostFrequentElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v = new int[n];
        for(int i = 0; i<n; i++){
            v[i] = sc.nextInt();
        }
        System.out.println(majorityElement(v));
    }

    public static int majorityElement(int[] v){
       Map<Integer, Integer> frequencyMap = new HashMap<>();
       int maxcount = 0;
       int majorityelement = -1;

        for (int num : v) {
            int count = frequencyMap.getOrDefault(num, 0) + 1;
            frequencyMap.put(num, count);


            if(count > maxcount){
               maxcount = count;
               majorityelement = num;
           }
       }
       if(maxcount > v.length/2){
           return majorityelement;
       } else{
           return -1;
       }
    }
}
