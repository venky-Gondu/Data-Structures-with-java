  
class Node{
    int data;
    Node next;
    
}
public class dsa14 {
    Node head;
    Node front=null,rear=null;
        public void enque(int val){
    Node newnode=new Node();
    newnode.data=val;
    newnode.next=null;
    //Node head;
    if( front==null&&rear==null){
front=rear=newnode;
head=newnode;

    }else{
        rear.next=newnode;
        rear=newnode;
    }
}public void deque(){
    if(front == null)
    System.out.println("Queue is Empty");
    else
        {
            System.out.println("Dequeued Element = "+front.data);

            front = front.next;

            if(front == null)
                rear = null;
        }
}public void display(){
   Node temp=head;
   if(front==null){
    System.out.println("queue is empty");
   }else{
    while(temp.next!=null){
        System.out.println(temp.data);
        temp=temp.next;
        
    }
   }

   
}public static void main(String[] args){
    dsa14 gsp=new dsa14();
    gsp.enque(7);
    gsp.enque(0);
    gsp.enque(45);
    gsp.enque(55);
    gsp.enque(90);
    gsp.enque(777);
    gsp.enque(143);
    gsp.display();
    gsp.deque();
gsp.display();

}


}  
