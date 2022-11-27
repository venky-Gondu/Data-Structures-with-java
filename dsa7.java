class Node{
Node prev;
Node next;
int data;
 

}public class dsa7{
    // inserting node at begining of the double linkedlist
    Node head=null;
    public void addelemnt(int val){
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
    } public void display(){Node temp= head;
        while(temp !=null){
            System.out.println(temp.data);
            temp=temp.next;
           // System.out.println();
            
            }
    
    }public static void main(String[] args ){
        dsa7 ad=new dsa7();
        ad.addelemnt(3);
        ad.addelemnt(5);
        ad.addelemnt(7);
        ad.display();
        ad.addelemnt(50);
        ad.display();
        ad.addelemnt(89);
        ad.display();
        //System.out.println();
        
    }
}