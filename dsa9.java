// deleting elemnts from the double linked lists
class Node{
int data;
Node prev;
Node next;

}public class dsa9{
    Node head=null;
    public void addelement(int val){
        Node newnode=new Node();// creating new node
        newnode.data=val;// inserting nodedata value 
        if(head==null){// if haad is null then the new node become head of the linked list 
            newnode.prev=null;
newnode.next=null;
head=newnode;
        }else{// chinging the head  to newly added node
            newnode.prev=null;
            newnode.next=head;
            head.prev=newnode;
            head=newnode;
        }
    }public void display(){
        Node temp= head;
        while(temp !=null){
            System.out.println(temp.data);
            temp=temp.next;
           // System.out.println();
            
            }
    }// delete elements from front side
    public void delfr(){
Node frt=head;
head=head.next;
frt.next=null;
head.prev=null;

    }public void delmid(int pod){
         Node kyathi=head;
         for(int i=0;i<pod-1;i++){
            kyathi=kyathi.next;
         }kyathi.prev.next=kyathi.next;
         kyathi.next.prev=kyathi.prev;

System.out.println(head.data);
        }
    
    
    
    
    public static void main(String[] args){
        dsa9 we=new dsa9();
        we.addelement(9);
        we.addelement(67);
        we.addelement(88);
        we.addelement(44);
        we.display();// display elements before deletion
        System.out.println("before deletion");
        we.delfr();
        System.out.println("deleting first element");
        we.display();
        // deleting second element
        we.delfr();
        we.display();
        we.addelement(99);
        we.addelement(343);
        we.addelement(143);
        we.display();
        we.delmid(4);
        System.out.println("deleting elments from middle");
        
    }
}