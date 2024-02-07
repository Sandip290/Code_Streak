import java.util.Scanner;

public class CapacityOfShip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int days = sc.nextInt();
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            weights[i] = sc.nextInt();
        }
        System.out.println(search(weights, days));
    }

    public static int search(int[] weights, int days){
        int low = maxEle(weights);
        int high = sumOfEle(weights);
        while(low <= high){
            int mid = (low + high)/2;
            int no_of_days = func(weights, mid);
            if(no_of_days <= days){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }

    public  static int func(int[] weights, int capacity){
        int days=1;
        int load =0;
        for(int i=0; i< weights.length; i++){
            if(load + weights[i] > capacity){
                days = days +1;
                load = weights[i];
            }
            else{
                load += weights[i];
            }
        }
        return days;
    }

    public static int maxEle(int[] weights){
        int max = weights[0];
        for(int i =0; i< weights.length; i++){
            if( weights[i] > max ){
                max = weights[i];
            }
        }
        return max;
    }

    public static int sumOfEle(int[] weights){
        int sum = 0;
        for(int i=0; i< weights.length; i++){
            sum += weights[i];
        }
        return sum;
    }
}
