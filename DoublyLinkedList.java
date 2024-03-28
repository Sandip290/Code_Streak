class DoublyLinkedList {
    private Node head;
    private Node tail;
    private int size;

    // Constructor
    public DoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    // Node class
    private static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data, Node next, Node prev) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }

    // Method to check if the list is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Method to get the size of the list
    public int size() {
        return size;
    }

    // Method to add a node at the start of the list
    public static Node insertAtStart(Node head, int val){
            Node newNode = new Node(val, head, null);
            head.prev = newNode;
            return newNode;
    }

    // Method to add a node at the end of the List
    public static Node insertAtEnd(Node head, int val){
        if (head == null){
            Node newNode = new Node(val, null, null);
          head = newNode;
          return head;
        }
        else{
            Node temp = head;
            while(temp.next != head){
                temp = temp.next;
            }
            Node newNode = new Node(val, null, temp);
            temp.next = newNode;

            return head;
        }
    }


    // Method to insert a node at kth element
    public static Node insertAtPos(Node head, int val ,int pos){
        if (pos == 1){
            return insertAtStart(head, val);
        }
        Node temp = head;
        int count = 0;
        while ( temp != null){
            count ++;
            if (count == pos) break;
            temp = temp.next;
        }
        Node tail = temp.prev;
        Node newNode = new Node(val, temp , tail);
        tail.next = newNode;
        temp.prev = newNode;

        return head;
    }

    // Method to remove element from start

    public static Node removeFromStart(Node head){
        if (head == null){
            return null;
        }
       else {
           Node temp = head;
        }
       return head;
    }



    // Method to display the list


    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

    }
}
