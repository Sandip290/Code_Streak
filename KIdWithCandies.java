import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KIdWithCandies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] candies = new int[n];
        for(int i = 0; i < n ; i++){
            candies[i] = sc.nextInt();
        }
        int extraCandies = sc.nextInt();

        System.out.println(extraCandies(candies, extraCandies));
    }

    public static List<Boolean> extraCandies(int[] candies, int extraCandies){
            List <Boolean> result = new ArrayList<>();
            for (int i =0; i< candies.length; i++){
               int temp = candies[i] + extraCandies;
               boolean res = true;
                for(int j = 0; j < candies.length; j++){
                    if ( temp < candies[j] ){
                        res = false;
                    }
                }
                result.add(res);
            }
            return result;
    }
}
