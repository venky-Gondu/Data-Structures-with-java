// inserting elements at the beging of the circular linked lists

class Node{
    int data;
    Node next;
}
public class dsa11 {
    Node head;
    public void addfist(int val){
        Node newnode=new Node();
            newnode.data=val;
        if(head==null){
            newnode.next=newnode;
            head=newnode;
        }else{
            Node temp=head;
            while(temp.next!=head){
                temp=temp.next;
            }temp.next=newnode;
            newnode.next=head;
            head=newnode;

        } 
    }public void addmid(int val, int pos){
        Node newnode=new Node();
        newnode.data=val;
        Node kyathi=head;
        for(int i=0;i<pos-1;i++){
kyathi=kyathi.next;
        }//kyathi.next=newnode;
        newnode.next=kyathi.next;
        kyathi.next=newnode;
            
    }
    
    
    
    
    public void display(){
        if(head==null){
            return;
        }
         Node last=head;
         do{
            System.out.println(last.data);
            last=last.next;
         }
        while(last !=head);
            
        
    }public void delfist(){
//deleting elements from  the circular linked lists
Node last=head;
while(last.next !=head){
    last=last.next;
}Node temp=head;
last.next=temp.next;
head=temp.next;
    }public void delmid(int post){
        Node temp=head;
        for(int i=0;i<post;i++){
            temp=temp.next;
        }temp.next=temp.next.next;
    }
    
    
    
    
    
    
    public static void main(String[] args){
        dsa11 gap=new dsa11();
        gap.addfist(23);
        gap.addfist(34);
        gap.addfist(78);
        gap.addfist(67);
        gap.addfist(3030);
        gap.addfist(7890);
        gap.display();
        System.out.println("adding elements t certain position");
        gap.addmid(2, 2);
        gap.display();
        gap.delfist();
        System.out.println("delete elements in bging of list");
        gap.display();
        System.out.println("elements delete at certain position");
        gap.delmid(3);
        gap.display();

    }
}
