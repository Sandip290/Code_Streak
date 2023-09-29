import java.util.*;
public class SortColors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        sortColors(nums);
    }

    public static void sortColors(int[] nums){
        int countred = 0;
        int countwhite = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 0){
                countred++;
            }else if(nums[i] == 1){
                countwhite++;
            }
        }
        for(int i = 0; i < countred; i++){
          nums[i] = 0;
        }
        for(int i = countred; i < countwhite+countred; i++){
            nums[i] = 1;
        }
        for(int i = countred+countwhite; i < nums.length; i++){
            nums[i] = 2;
        }
    }

}
