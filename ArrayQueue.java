public class ArrayQueue {
    public void main(String args[]) {
        Queue q = new Queue(6);
        q.push(4);
        q.push(14);
        q.push(24);
        q.push(34);
        System.out.println("The peek of the queue before deleting any element " + q.top());
        System.out.println("The size of the queue before deletion " + q.size());
        System.out.println("The first element to be deleted " + q.pop());
        System.out.println("The peek of the queue after deleting an element " + q.top());
        System.out.println("The size of the queue after deleting an element " + q.size());
    }
class Queue {
    private int arr[];
    private int start, end, currsize, maxsize;

    public Queue() {
        arr = new int[16];
        start = -1;
        end = -1;
        currsize = 0;
    }

    public Queue(int i) {
        this.maxsize = maxsize;
        arr = new int[maxsize];
        start = -1;
        end = -1;
        currsize = -1;
    }

    public void push(int newelement) {
        if (currsize == maxsize) {
            return;
        }
        if (end == -1) {
            end = 0;
            start = 0;
        } else {
            end = (end + 1) % maxsize;
        }
        arr[end] = newelement;
        currsize++;
    }

    public int pop() {
        if (start == -1) {
            return -1;
        }
        int pooped = arr[start];
        if (currsize == 1) {
            start = -1;
            end = -1;
        } else {
            start = (start + 1) % maxsize;
        }
        currsize--;
        return pooped;
    }

    public int top() {
        if (start == -1) return -1;
        return -1;
    }

    public int size() {
        return currsize;
    }
}
}
