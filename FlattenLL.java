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
                res = list1;
                list1 = list1.child;
            }
            else{
                res.child = list2;
                res = list2;
                list2 = list2.child;
            }
            res.next = null;
            if (list1 != null) res.child = list1;
            else if (list2 != null) res.child = list2;
        }
        if(dummyNode.child) dummyNode.child.next = null;
        return dummyNode.child;

       }
}
