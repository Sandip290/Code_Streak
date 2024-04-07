import java.util.*;

class Node {
    public int data;
    public Node next;
    public Node random;

    Node()
    {
        this.data = 0;
        this.next = null;
        this.random = null;
    }
    Node(int data)
    {
        this.data = data;
        this.next = null;
        this.random = null;
    }
    Node(int data, Node next, Node random)
    {
        this.data = data;
        this.next = next;
        this.random = random;
    }
}
public class CloneLinkedList {
    public static Node cloneLL(Node head) {
        // Write your code here.
        if (head == null) {
            return null;
        }


        Node temp = head;
        while (temp != null){
            Node copyNode = new Node(temp.data);
            copyNode.next = temp.next;
            temp.next = copyNode;
            temp = temp.next.next;
        }

        temp = head;
        while(temp != null){
            if(temp.random != null){
                temp.next.random = temp.random.next;
            }
            temp = temp.next.next;
        }

        Node dummyNode = head.next;
        Node res = dummyNode;
        temp = head;
        while(temp != null) {
            temp.next = temp.next.next;
            temp = temp.next;

            if (res.next != null) {
                res.next = res.next.next;
                res = res.next;
            }
        }

        return dummyNode;
    }


}
