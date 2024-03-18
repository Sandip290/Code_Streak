import java.util.Scanner;

public class LengthOfLL {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        Node head = constructLL(arr);

        System.out.println(LengthLL(head));



    }

    public static Node constructLL(int[] arr){
        Node head = new Node(arr[0]);
        Node Mover = head;
        for (int i = 1; i < arr.length; i++){
            Node temp = new Node(arr[i]);
            Mover.next = temp;
            Mover = temp;
        }
        return head;
    }

    public static int LengthLL(Node head){
        int count = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        return count;
    }
}
