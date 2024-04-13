import java.util.Stack;

public class StackUsingLL {
    private class StackNode{
        int data;
        StackNode next;
        StackNode(int d){
            data = d;
            next = null;
        }
    }

    StackNode top;
    int size;

    StackUsingLL(){
        this.top = null;
        this.size = 0;
    }

    public void stackPush(int x){
        StackNode ele = new StackNode(x);
        ele.next = top;
        top=ele;
        size++;
    }

    public int stackPop(){
        if (top == null) return -1;
        int topdata = top.data;
        StackNode temp = top;
        top = top.next;
        size--;
        return topdata;
    }

    public boolean stackIsEmpty(){
        return top == null;
    }

    public int getSize(){
        return size;
    }
}
