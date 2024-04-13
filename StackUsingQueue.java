import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class StackUsingQueue {
    Queue<Integer> q = new LinkedBlockingDeque<>();

    public void push(int x){
        q.add(x);
        for(int i = 0 ; i<q.size() - 1; i++){
            q.add(q.remove());
        }
    }

    public int pop(){
        return q.remove();
    }

    public int top(){
        return q.peek();
    }

    public int size(){
        return q.size();
    }
}
