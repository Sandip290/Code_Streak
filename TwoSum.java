import java.util.*;
public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] book = new int[n];
        int target = sc.nextInt();
        for(int i = 0; i<n; i++){
            book[i] = sc.nextInt();
        }
        System.out.println(read(n,book,target));
    }

    public static <map> String read(int n, int[] book, int target){
        int left = 0, right = n -1;
        Arrays.sort(book);
        while(left < right){
            int sum = book[left] + book[right];
            if(sum == target){
                return "yes";
            }
            else if(sum < target){
                left++;
            }
            else{
                right--;
            }
          }
        return "no";
        // THIS IS THE BRUTE FORCE SOLUTION
//        for(int i = 0; i< n; i++){
//            for(int j = 0; j<n; j++){
//                if (i == j) {
//                    continue;
//                }
//                if(book[i] + book[j] == target){
//                    return "YES";
//                }
//                else{
//                    return "NO";
//                }
//            }
//        }
//        return null;
    }
}
