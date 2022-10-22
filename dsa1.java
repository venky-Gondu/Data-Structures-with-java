//implementing array operations in java
//searching elements in unshorted array
class dsa1{
// creating class 
 static int find_element(int arr[], int n, int key) {
    for (int i=0;i<n;i++)
        if(arr[i]== key)
            return i;//if key is not found

        return -1;}
    
public static void main(String[] args){
    int arr[]={1,4,6,11,69,40};
    int n=arr.length;int key=40;
    // using a last elenent as search element
    int position =find_element(arr,n,key);
    if(position ==-1){
        System.out.println("element not found");
    }else{
        System.out.println("element is found at positon"+(position+1));

    }
}
}