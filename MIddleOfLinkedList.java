import java.util.Scanner;

public class MIddleOfLinkedList {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i< n; i++){
            arr[i] = sc.nextInt();
        }
        Node head = constructLL(arr);

        System.out.println(middleOfLL(head));
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

    public static Node middleOfLL(Node head){

        // thia is the brute force approach
//        if (head == null || head.next == null) {
//            return head;
//        }
//        Node temp = head;
//        int count = 0;
//        while (temp != null){
//            count++;
//            temp = temp.next;
//        }
//        int mid = count/2;
//        temp = head;
//        for (int i = 0; i < mid ; i++){
//            temp = temp.next;
//        }
//        head = temp;
//        return head;

        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }



}
