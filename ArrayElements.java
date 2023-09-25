import java.util.Scanner;
public class ArrayElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] res = new int[x];
        for(int i =0; i<x; i++){
            res[i] = i+1;
        }
        for(int i =0; i<x; i++){
            System.out.print(res[i] + " ");
        }
    }
}
