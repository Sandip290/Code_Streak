import java.util.Scanner;

public class MInEatingSpeed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int[] piles = new int[n];
        for (int i = 0; i < n; i++) {
            piles[i] = sc.nextInt();
        }
        System.out.println(search(piles, h));
    }

    public static int search(int piles[], int h){
        int low =1;
        int high = max_hrs(piles);
        while(low <= high){
            int mid =(low+high)/2;
            int total_hrs = reqTime(piles, mid);
            if (total_hrs <= h){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }

    public static int reqTime(int piles[], int h){
        int totalHours = 0;
        for (int bananas : piles) {
            totalHours += (int) Math.ceil((double) bananas / h);
        }
        return totalHours;
    }

    public static int max_hrs(int piles[]){
        int max = 0;
        for(int i =0; i< piles.length; i++){
            if(piles[i]>max){
                max = piles[i];
            }
        }
        return max;
    }
}
