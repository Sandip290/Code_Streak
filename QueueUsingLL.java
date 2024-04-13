public class QueueUsingLL {

   private class QueueNode {
       int data;
       QueueNode next;

       QueueNode(int val) {
           val = data;
           next = null;
       }
   }

    QueueNode front;
    QueueNode rear;
    int size;

   QueueUsingLL(){
      this.front = null;
      this.rear = null;
      this.size = 0;
   }

   public boolean queueIsEmpty(){
       return front == null;
   }

   public int getSize(){
       return size;
   }

   public void Enqueue(int x){
       QueueNode newtop = new QueueNode(x);
       if(front == null){
           front = newtop;
           rear = newtop;
       }
       else{
           rear.next = newtop;
           newtop.next = null;
       }
       size++;
   }

   public int dequeue(){
       if(front == null) return -1;
       else{
           QueueNode temp = front;
           front = front.next;
           size--;
           return temp.data;
       }
   }
}
