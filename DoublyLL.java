class DoublyLL {
    public class DLL{
        private static void print(Node head){
            while(head != null){
                System.out.print(head.data+ " ");
                head = head.next;
            }
            System.out.println();
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

        public static void main(String args[]){
            int[] arr = {23,45,67,789,33,544};
            Node head = convertArrToDll(arr);
            print(head);
        }
    }
}
