
//insertion of elements in unshoted list

public class dsa2 {
  static int insrtSorted(int arr[],int n,int key,int capacity) {
if (n>=capacity)
return n;//we can not over written the array values
arr[n]=key;
return (n+1);
  }  public static void main(String[] args){
    int arr[]  =new int[6];
arr[0]=12;
arr[1]=13;
arr[2]=14;
arr[3]=15;
arr[4]=16;
arr[5]=17;
int capacity=arr.length;
int n=6;
int i,key=26;
System.out.println("before insertion ");
for(i=0;i<n;i++)
System.out.print(arr[i] + " ");
    

n = insrtSorted(arr,n,key,capacity);
System.out.print("\n after instion");
for (i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
}

}
