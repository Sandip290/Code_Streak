import java.util.Scanner;

public class NoOfBouquet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int[] bloomDays = new int[n];
        for (int i = 0; i < n; i++) {
            bloomDays[i] = sc.nextInt();
        }
        System.out.println(search(bloomDays, m, k));
    }

    public static int search(int[] bloomDays, int m, int k) {
        if (bloomDays.length < m*k){
            return -1;
        }
        int low = minEle(bloomDays);
        int high = maxEle(bloomDays);
        int ans = high;
        while(low < high){
            int mid = (low + high)/2;
            if(possible(bloomDays, mid , m , k)){
                ans = mid;
                high = mid -1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }

    public static boolean possible(int[] bloomDays, int day, int m, int k){
        int count = 0;
        int no_of_b = 0;
        for(int i = 0; i<= bloomDays.length-1; i++){
            if(bloomDays[i] <= day){
                count++;
            }
            else{
                no_of_b += (count/k);
                count = 0;
            }
        }
        no_of_b += (count/k);
        return no_of_b >= m;
    }

    public static int minEle(int[] bloomdays){
        int min = bloomdays[0];
        for (int i = 0; i< bloomdays.length; i++){
            if (bloomdays[i] < min){
                min = bloomdays[i];
            }
        }
        return min;
    }

    public static int maxEle(int[] bloomdays){
        int max = bloomdays[0];
        for (int i = 0; i< bloomdays.length; i++){
            if (bloomdays[i] > max){
                max = bloomdays[i];
            }
        }
        return max;
    }
}
