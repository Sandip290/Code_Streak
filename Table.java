import java.util.Scanner;

public class Table {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int value = 0;
        int sum = 0;

        for (int i = 1; i <= 10; i++){
            value = n * i;
            System.out.print(value + " ");
            sum = sum + value;
        }

        System.out.println(" " + sum + " ");
    }
}
