public class FlattenLL {
    public static Node merge(Node head){
        if (head == null || head.next == null){
            return head;
        }
        Node mergehead = merge(head.next);
        return mergeTwoLL(head, mergehead);
    }

    public static Node mergeTwoLL(Node list1, Node list2){
        Node dummyNode = new Node(-1);
        Node res = dummyNode;
        while(list1 != null && list2 != null ){
            if (list1.data < list2.data){
                res.child = list1;
                list1 = list1.child;
            } else {
                res.child = list2;
                list2 = list2.child;
            }
            res = res.child;
        }

        if (list1 != null) {
            res.child = list1;
        } else if (list2 != null) {
            res.child = list2;
        }

        return dummyNode.child;
    }

    public static class Node {
        int data;
        Node next;
        Node child;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.child = null;
        }
    }

    public static void main(String[] args) {
        // Example usage
        Node head = new Node(3);
        head.next = new Node(5);
        head.child = new Node(4);
        head.child.child = new Node(6);

        Node flattenedList = merge(head);
        while (flattenedList != null) {
            System.out.print(flattenedList.data + " ");
            flattenedList = flattenedList.child;
        }
    }
}



//    Changes made:
//
//        Corrected the mergeTwoLL method to ensure proper merging and setting the child pointers.
//        Added a check at the end of the mergeTwoLL method to attach the remaining part of the list that is not yet merged.
//        Removed unnecessary null assignments.
//        Added the Node class definition for completeness.
//        Added an example usage in the main method to demonstrate how the merging works.
//        This should correctly merge and flatten the linked lists as intended.