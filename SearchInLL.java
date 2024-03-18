import java.util.Scanner;

public class SearchInLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        Node head = constructLL(arr);

        System.out.println(search(head, k));
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

    public static int search(Node head, int k){
        Node temp = head;
        while(temp != null){
            if (temp.data == k){
                return 1;
            }
            temp = temp.next;
        }
        return 0;
    }
}
