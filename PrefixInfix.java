import java.util.Stack;

public class PrefixInfix {
    public static String preifxToInfix(String exp){
        String result = "";
        Stack <String> st = new Stack<>();
        for (int i = exp.length()-1; i >= 0 ; i--){
            char c = exp.charAt(i);
            if(Character.isLetterOrDigit(c)){
                st.push(String.valueOf(c));
            }
            else{
                String op1 = st.pop();
                String op2 = st.pop();

                result = "(" + op1 + c + op2 + ")";
                st.push(result);
            }
        }
        return result;
    }
}
