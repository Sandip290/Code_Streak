//class Node{
//    public int data;
//    public Node next;
//
//    // Constructor for Node with data and next node
//    public Node(int data1, Node next1) {
//        data = data1;
//        next = next1;
//    }
//
//    // Constructor for Node with only data (next set to null)
//    public Node(int data1) {
//        this(data1, null); // Call the other constructor to set next to null
//    }
//}

public class DeleteNodeAtEnd {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int N = 3;
        Node head = new Node(arr[0]);
        head.next = new Node(arr[1]);
        head.next.next = new Node(arr[2]);
        head.next.next.next = new Node(arr[3]);
        head.next.next.next.next = new Node(arr[4]);

        // Delete the Nth node from the end and print the modified linked list
        head = DeleteNthNodefromEnd(head, N);
        printLL(head);
    }

    public static void printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node DeleteNthNodefromEnd(Node head, int k){
        Node fast = head;
        Node slow = head;
        Node prev = null; // Keeps track of the node before the one to be deleted

        // Move fast pointer k nodes ahead
        for (int i = 0; i < k; i++) {
            if (fast == null) // If k is larger than the length of the list
                return head;
            fast = fast.next;
        }

        // Move both pointers until fast reaches the end
        while (fast != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next;
        }

        // If the node to be deleted is the head node
        if (prev == null) {
            head = head.next;
        } else {
            prev.next = slow.next;
        }

        return head;
    }
}
