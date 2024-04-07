public class DeleteOccurance {
    public static Node DeleteKey(Node head, int k){
        Node temp = head;
        while(temp != null){
            if ( temp.data == k) {
                if (temp == head) head = head.next;
                Node nextNode = temp.next;
                Node prevNode = temp;  //temp.prev
//                if (nextNode != null) nextNode.prev = prevNode;
                if (prevNode != null) prevNode.next = nextNode;
                temp = temp.next;
            }
            else{
                temp = temp.next;
            }
        }
        return head;
    }
}
