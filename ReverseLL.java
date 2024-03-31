import java.util.Scanner;
import java.util.Stack;

public class ReverseLL {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i< n; i++){
            arr[i] = sc.nextInt();
        }
        Node head = constructLL(arr);

        System.out.println(reverseLinkedList(head));
    }

    public static Node constructLL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i =0; i<arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static Node reverseLinkedList(Node head){

        // THIS IS THE BRUTE FORCE APPROACH
//        Node temp = head;
//        Stack <Integer> stack = new Stack<>();
//
//        while(temp != null){
//            stack.push(temp.data);
//            temp = temp.next;
//        }
//        temp = head;
//        while(temp != null){
//            temp.data = stack.pop();
//            temp = temp.next;
//        }
//        return head;

        //  OPTIMAL APPROACH --- 1
//            Node prev = null;
//            Node temp = head;
//            while(temp != null){
//                Node front = temp.next;
//                temp.next = prev;
//                prev = temp;
//                temp = front;
//            }
//            return prev;

        //OPTIMAL APPROACH --- 2
        if (head == null || head.next == null){
            return head;
        }

        Node newhead = reverseLinkedList(head.next);
        Node front = head.next;

        front.next = head;

        head.next = null;

        return newhead;


    }





}
