import java.util.ArrayList;
import java.util.Scanner;

public class EncodeToNBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = sc.nextInt();
        System.out.println("The result is:");
        System.out.println(transToNBase(n, num));
    }

    public static String transToNBase(int n, int num){
        String res="";
        int ques = num / n;
        ArrayList < Integer > rem = new ArrayList<>();
        rem.add(num % n);

        //taking three variables one to store the result, one store the current quotient, one to store the set of remainder

        while(ques != 0){
            rem.add(ques % n);
            ques = ques / n;
        }

        //while loop get all the  possible element for the rem til the quotient become 0

        for (int i =0; i<rem.size(); i++){
            if(rem.get(i) > 9){
                res = (char) ( rem.get(i) - 9 + 64) + res;  // this is line is to convert the integer into char
            }
            else{
                res = rem.get(i) + res;
            }
        }

        //convert the num into NBaseCode
        System.out.println(rem);
        System.out.println(res);

        return  res;
    }
}
