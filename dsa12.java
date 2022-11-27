//import javax.naming.ldap.ExtendedRequest;

// creating elements in queue
public class dsa12{
    int arr[]= new int[7];
    int rear=-1;
    int front=-1;
    public  void enque(int elemen){
if(rear==7){
    System.out.println("queue is full");

}else{
    rear++;
    arr[rear]= elemen;
}
    }public void display(){
        if(rear==0){
            System.out.println("the queue is empty");
        }else{
            for(int i=0;i<=rear;i++){
                System.out.println(arr[i]);
            }
            
        }
    }// deleting elemnts in queue is dequeue operatoion
    public void dequeue(){
        if(front==rear ){
            System.out.println("queue is empty");
        }else{
            front++;
            int ele=arr[front];
            System.out.println("deleted element"+ele);
            
            display();
        }
    }
    public static void main(String[] args ){
        dsa12 net=new dsa12();
        net.enque(5);
        net.enque(33);
        net.enque(66);
        net.enque(88);
        net.enque(9);
        net.enque(90);
        net.enque(777);
        net.display();
        net.dequeue();
        net.dequeue();
        
        //net.enque(45);
        //net.display();
    }


}