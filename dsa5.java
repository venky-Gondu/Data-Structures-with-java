//import java.util.LinkedList;
// linked  list application using array 
class Node{
    int data;
    Node next;// it is the refrence to and it stores the refernce node value 
}


public class dsa5 {
   private static dsa5 li;
Node head;
//private Object lastNode;
public void add(int val){
    Node newNode =new Node();// creating new node
  newNode.data =val;//intialising the values to data part of the node
newNode.next=null;//instialising the null values to the 
if (head==null){//cheacking the values of the head of 
head=newNode;}// making the new nodevalue  as head value

else{ Node lastNode = head;//if the lastly added node is head go  in the loop
    while( lastNode.next != null){//  cheacking the last  node value and if its null exit from the loop
 lastNode =lastNode.next;// if last node is not null then lastnode points the next node
    }
lastNode.next = newNode;//storing the value of newnode to lastnode part 

 } }public void display(){
    Node temp = head;
    while(temp != null){
        System.out.println(temp.data);
        temp= temp.next;
    }
 }
public void delete(int key ){// deleting the elements in the linked list
//Object Node;
//Node temp;
if(head.data==key){// cheacking the key value is equal to the head data value;  
    head=head.next;// if key value is true then make the next node as head of the linnkd list
}else {// key value is not head value then check whole linked list
    Node temp = head;
    while(temp.next != null){
        if(temp.next.data ==key){// key value is eqaul to upcomig node data value then 
            temp.next = temp.next.next; // make the temp value to the next  node
break;
        }else{
           temp= temp.next;
        }
    }
}display();
}





public static void main(String[] args){
    dsa5.li = new dsa5();
    System.out.println("10");
    li.add(10);
    System.out.println("20");li .add(20);
    System.out.println("30");li.add(30);
    li.display();
    li.delete(20);
    
}


}
