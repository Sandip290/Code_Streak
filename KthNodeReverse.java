public class KthNodeReverse {
    public static Node kthReverse(Node head, int k){
        Node temp = head;
        Node prevLast = null;
        while(temp != null){
            Node kthNode = getKthNode(temp, k);
            if (kthNode == null){
                if (prevLast != null){
                    prevLast.next = temp;
                }
                break;
            }

            Node nextNode = kthNode.next;
            kthNode.next = null;
            reverseLinkedList(temp);
            if (temp == head){
                head = kthNode;
            }
            else{
                prevLast.next = kthNode;
            }
            prevLast = temp;
            temp = nextNode;
        }
        return head;
    }

    static Node reverseLinkedList(Node head) {
        // Initialize'temp' at
        // head of linked list
        Node temp = head;

        // Initialize pointer 'prev' to NULL,
        // representing the previous node
        Node prev = null;

        // Traverse the list, continue till
        // 'temp' reaches the end (NULL)
        while(temp != null){
            // Store the next node in
            // 'front' to preserve the reference
            Node front = temp.next;

            // Reverse the direction of the
            // current node's 'next' pointer
            // to point to 'prev'
            temp.next = prev;

            // Move 'prev' to the current
            // node for the next iteration
            prev = temp;

            // Move 'temp' to the 'front' node
            // advancing the traversal
            temp = front;
        }

        // Return the new head of
        // the reversed linked list
        return prev;

    }

    // Function to get the Kth node from
    // a given position in the linked list
    static Node getKthNode(Node temp, int k) {
        // Decrement K as we already
        // start from the 1st node
        k -= 1;

        // Decrement K until it reaches
        // the desired position
        while (temp != null && k > 0) {
            // Decrement k as temp progresses
            k--;

            // Move to the next node
            temp = temp.next;
        }

        // Return the Kth node
        return temp;
    }
}
