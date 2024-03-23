class Node{
    int data;
    Node next;

    Node(int data1, Node next1, Node prev){
        this.data = data1;
        this.next = next1;
    }

    Node(int data1){
        this.data = data1;
        this.next = null;
    }
}

public class LinkdList {
    public static Node Convert( int[] arr){
        Node head = new Node(arr[0]);
        Node Mover = head;
        for ( int i = 0; i < arr.length; i++){
            Node temp = new Node(arr[i]);
            Mover.next = temp;
            Mover = temp;
        }
        return head;
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

    public static int search(Node head, int target){
        Node temp = head;
        while(temp != null){
            if (temp.data == target){
                return 1;
            }
            temp = temp.next;
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
//        Node obj = new Node(arr[4]);
//        System.out.println(obj.data);
//        System.out.println(obj.next);
        Node head = Convert(arr);
        System.out.println(head.data);
    // to traverse through the linkedlist
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    // to find the length of the linked list
        System.out.println(lengthLL(head));

    // to search an element in the linked list
        System.out.println(search(head, 10));
    }

}
