import java.util.Stack;

public class PrefixPostfix {
    public static String preficToPostfix(String s){
        String result = "";
        Stack <String> st = new Stack<>();
        for (int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)){
                st.push(String.valueOf(c));
            }
            else{
                if (!st.isEmpty()){
                    String op1 = st.pop();
                    String op2 = st.pop();

                    result = op1 + op2 + c;
                    st.push(result);
                }
            }
        }
        return !st.isEmpty() ? st.peek() : "";
    }
}
