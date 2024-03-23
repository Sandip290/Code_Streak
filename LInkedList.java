import java.util.Scanner;

public class LInkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        Node head = constructLL(arr);

        insertAtFirst(head, 3);
        insertAtFirst(head, 4);
        insertAtFirst(head, 6);
        insertAtFirst(head, 8);
        insertAtFirst(head, 4);


        deleteEle(head, 3);

        System.out.println(search(head, k));

        System.out.println(lengthLL(head));

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

    public static int lengthLL(Node head){
        int count = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        return count;
    }

    public static Node deleteEle(Node head, int ele){
        if (head == null){
            return null;
        }

        if (head.data == ele){
            head = head.next;
            return head;
        }

        Node temp = head;
        Node prev = null;
        while(temp != null){
            if (temp.data == ele){
                prev.next = prev.next.next;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    public static Node insertEle(Node head, int ele){
        if (head == null){
            head.data = ele;
        }

        if(head.next == null){
            Node temp = head;
            head.next = temp;
            head = new Node(ele);
        }
        return head;
    }

    public static Node insertAtFirst(Node list, int newValue){
       Node newNode = new Node (newValue);
       newNode.next = list;
       return newNode;
    }

//    public static Node insertAtFirst(Node head, int ele) {
//        Node newNode = new Node(ele); // Create a new node with the given element
//        newNode.next = head; // Set the next pointer of the new node to the current head
//        return newNode; // Update the head to point to the new node
//    }

}
