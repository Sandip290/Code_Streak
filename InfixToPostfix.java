import java.util.ArrayList;
import java.util.Stack;

public class InfixToPostfix {

    static int pre(char ch){
        switch(ch){
            case '+':
            case '-':
                return 1;

            case '*':
            case'/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }

    public static String infixToPostfix(String exp){
        // Write your code here
        String result = new String("");
        Stack <Character> st = new Stack<>();
        for (int i = 0; i< exp.length(); ++i){
            char c = exp.charAt(i);
            if (Character.isLetterOrDigit(c)){
                result += c;
            }
            else if(c == '('){
               st.push(c);
            }
            else if (c == ')'){
                while(!st.isEmpty() && st.peek() != '('){
                    result += st.peek();
                }
                if(!st.isEmpty() && st.peek() == '('){
                   st.pop();
                }
            }
            else{
                while(!st.isEmpty() && pre(c) <= pre(st.peek())){
                    result += st.pop();
                }
                st.push(c);
            }
        }

        while(!st.isEmpty() ){
            if(st.peek() == '('){
                result += st.pop();
            }
            else{
                st.pop();
            }
        }

        return result;
    }
}
