class Node {
    public int data;       // Data stored in the node
    public Node next;      // Reference to the next node in the list (forward direction)
    public Node back;      // Reference to the previous node in the list (backward direction)

    // Constructor for a Node with both data, a reference to the next node, and a reference to the previous node
    public Node(int data, Node next, Node back) {
        this.data = data;
        this.next = next;
        this.back = back;
    }

    // Constructor for a Node with data, and no references to the next and previous nodes (end of the list)
    public Node(int data) {
        this.data = data;
        this.next = null;
        this.back = null;
    }
}

public class DoublyLinkedList {
    public static void main(String[] args) {
            int[] arr = {23,45,67,789,33,544};
            Node head = convertArrToDll(arr);
            print(head);
    }

    public static Node convertArrToDll(int[] arr){
        if (arr==null || arr.length==0){
            return null;
        }
        Node head = new Node(arr[0]);
        Node prev = head;
        for (int i =1; i<arr.length; i++){
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    private static void print(Node head){
        while(head != null){
            System.out.print(head.data+ " ");
            head = head.next;
        }
        System.out.println();
    }



}
