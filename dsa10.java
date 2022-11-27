// circular linked lists using single linked lists
class Node{
    int data;
    
    Node next;
}

public class dsa10 {
    public static void main(String[] args){
        Node head,middle,last;
        head=new Node();
        middle=new Node();
        last =new Node();
        // allowcatig element values in to the nodes
        head.data=76;
        middle.data=56;
        last.data=46;
// linking nodes
head.next=middle;
middle.next=last;
last.next=head;
System.out.println("circular linked lists elements");
Node temp=head;
do{
    System.out.println(temp.data);
    temp=temp.next;
} while(temp != head);
    } 
}
