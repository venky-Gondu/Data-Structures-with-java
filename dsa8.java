// inserting elements in ending of double linked list
class Node{
   int data;
   Node prev;
   Node next;
   
   }public class dsa8{
       Node head;
   public void addelement(int val){
       Node newnode=new Node();
       newnode.data=val;
       if (head==null){
           newnode.prev=null;
           newnode.next=null;
           head=newnode; }else{
            Node last= head;
            while(last.next!=null){
               last=last.next;
            }last.next=newnode;
            newnode.prev=last;
            newnode.next=null;
           }}public void middle(int amnt,int position){
            Node newnode=new Node();
            newnode.data=amnt;
            Node red=head;
            for(int i=0;i<position-1;i++){
                red=red.next;}

                                       newnode.next=red.next;

                                       red.next.prev=newnode;

                                      red.next=newnode;

                                      newnode.prev=red;
            
           }
   public void display(){
       Node temp = head;
       while(temp!=null){
           System.out.println(temp.data);
           temp=temp.next;
       }
   }
   
   
   public static void main(String[] args){
       dsa8 as=new dsa8();
       as.addelement(1);
       as.addelement(2);
       as.addelement(66);
       as.addelement(77);
       //int pos=3;
       as.display();
       as.addelement(7);
       as.display();
       as.middle(45, 3);
       as.display();
   }}
