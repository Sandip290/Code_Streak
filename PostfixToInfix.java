import java.util.Stack;

public class PostfixToInfix {
    public static String posToIn(String exp){
        String res = "";
        Stack <String> st = new Stack<>();
        for(int i =0; i<exp.length(); i++){
            char c = exp.charAt(i);
            if(Character.isLetterOrDigit(c)){
                st.push(String.valueOf(c));
            }
            else{
                String op1 = st.pop();
                String op2 = st.pop();
                res = op1 + c + op2 ;
                st.push(res);
            }
        }
        return !st.isEmpty() ? st.peek() : " ";
    }
}
