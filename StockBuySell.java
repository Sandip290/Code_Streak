import java.util.*;

public class StockBuySell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];
        for(int i = 0; i<n; i++){
            prices[i] = sc.nextInt();
        }
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices){
       int maxprofit = 0;
       int minprice = prices[0];
       for(int i = 0; i< prices.length; i++){
           minprice = Math.min(minprice, prices[i]);
           int profit = prices[i] -  minprice;
           maxprofit = Math.max(maxprofit,profit);
       }
       return maxprofit;
    }
}
