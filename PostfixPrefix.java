import java.util.Stack;

public class PostfixPrefix {
    public static String postfixToPrefix(String s){
        String result = "";
        Stack<String> st = new Stack<>();
        for(int i =0; i<s.length(); i++){
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                st.push(String.valueOf(c));
            }
            else{
                String op1 = st.pop();
                String op2 = st.pop();
                result = c + op1 + op2;
                st.push(result);
            }
        }
        return !st.isEmpty() ? st.peek() :"";
    }
}
