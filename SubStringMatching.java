import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubStringMatching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.next();
        }

        System.out.println(matchingSubstring(arr));
    }

    public static List<String> matchingSubstring(String[] words){
                int n = words.length;
                List<String> ans = new ArrayList<>();

                for (int i = 0; i < n; ++i) {
                    for (int j = 0; j < n; ++j) {
                        if (i != j && words[j].contains(words[i])) {
                            ans.add(words[i]);
                            break;
                        }
                    }
                }

                return ans;
            }
}
