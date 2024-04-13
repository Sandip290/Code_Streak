import java.util.Scanner;

public class ArrayStack {
    int size = 1000;
    int arr[] = new int[size];
    int top = -1;

    public void push(int x){
        top++;
        arr[top] = x;
    }

    public int pop(){
        int x = arr[top];
        top--;
        return x;
    }

    public int top(){
        return arr[top];
    }

    public int size(){
        return top + 1;
    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        stack.push(x);
    }
}
