import java.util.Stack;

public class QueueUsingStack {
    Stack <Integer> input = new Stack<>();
    Stack <Integer> output = new Stack<>();

    public QueueUsingStack(){

    }

    public void push(int x){
        while(input.isEmpty() == false){
            output.push(input.peek());
            input.pop();
        }

        input.push(x);

        while(output.isEmpty() == false){
            input.push(output.peek());
            output.pop();
        }
    }

    public int pop(){
        if(input.isEmpty()){
            return -1;
        }
        int val = input.peek();
        input.pop();
        return val;
    }

    public int top(){
        if(input.isEmpty()){
            return -1;
        }

        return input.peek();
    }

    public int size(){
        return input.size();
    }

}
