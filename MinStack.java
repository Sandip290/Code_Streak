import java.util.Stack;

class Pair{
    int x ,y;
    Pair(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class MinStack {
 Stack<Pair> st;
    public MinStack(){
        st = new Stack<>();
    }

    public void push(int x){
        int min;
        if (st.isEmpty()){
            min = x;
        }
        else{
            min = Math.min(st.peek().y, x);
        }
        st.push(new Pair(x, min));

    }

    public int pop(){
        int temp = st.peek().x;
        st.pop();
        return  temp;
    }

    public int top(){
        return st.peek().x;
    }

    public int getMin(){
        return st.peek().y;
    }

}
