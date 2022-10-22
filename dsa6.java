// implementing double linked list
class Node{
    Node prev;// crating Node having prev node ,data type and next node 
    Node next;
    int data;
}public class dsa6{
public static void  main(String[] args){
    Node head;//craeting new node name head
    Node middle;// creating middle node
    

    Node last;// creating last node
     head =new Node();
     middle=new Node();
     last =new Node();
     head.data=10;//storing data value in the head node
     middle.data=20;//storing data value in the middle node
     last.data=30;//storing data value in the last node
     head.prev=null;
     head.next=middle;
     middle.prev=head;
     middle.next=last;
     last.prev=middle;
     last.next=null;
     Node temp=head;
     System.out.println("forward");
while(temp !=null){
    System.out.println(temp.data);
    temp=temp.next;
} temp = last;
System.out.println("backword");
while(temp != null){
    System.out.println(temp.data);
    temp=temp.prev;
}
}
}