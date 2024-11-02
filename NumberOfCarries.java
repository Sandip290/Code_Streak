import java.util.ArrayList;
import java.util.Scanner;

public class NumberOfCarries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("The number of carries:");
        System.out.println(countCarries(num1, num2));
    }

    public static int countCarries( int num1, int num2 ){
        int count = 0;
       int temp1 = num1;
       int temp2 = num2;
       int rem = 0;
       while(temp1 != 0 && temp2 != 0){
           int d1 = temp1 % 10;
           int d2 = temp2 % 10;
           if(d1 + d2 + rem > 9){
               count++;
               int sum = d1 + d2 + rem;
               sum = sum / 10;
               rem = sum;
           }
           temp1 = temp1 /10;
           temp2 = temp2 / 10;
       }
       return count;
    }
}
