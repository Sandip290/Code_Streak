public class DeleteDuplicateInDLL {
    public static Node deleteDuplicate(Node head){
//        Node temp = head;
//        while(temp != null && temp.next!= null){
//            Node nextNode = temp.next;
//            while(nextNode != null && nextNode == nextNode.next){
//                nextNode = nextNode.next;
//            }
//            temp.next = nextNode;
//            temp = temp.next;
//        }
//        return head;

        Node temp = head;
        while(temp != null && temp.next != null){
            if(temp == temp.next){
                temp.next = temp.next.next;
            }
            else{
                temp = temp.next;
            }
        }
        return head;
    }
}
