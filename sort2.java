
public class sort2 {
    public void insertsort( int arr[], int size ){
        int i,temp,index;
        for(i=1;i<size;i++){
            temp=arr[i];
            index=i;
            while(index>0 &&arr[index-1]>temp){
                arr[index]=arr[index-1];
                index--;
            }arr[index]=temp;
        }
    }public int partion(int arr3[],int start,int end){
    int pindex=start;
    //end=5;
        int pivot=arr3[end];
     int i;
     for(i=start;i<end;i++){
        if(arr3[i]<pivot){
            int temp=arr3[i];
            arr3[i]=arr3[pindex];
            arr3[pindex]=temp;

        }
     }int k=arr3[end];
     arr3[end]=arr3[pindex];
     arr3[pindex]=k;
     return pindex;
    }
    public void quicksort(int arr2[] ,int start,int end){
        if(start<=end){ 
            int pindex = partion(arr2, start, end);
            quicksort(arr2, start,pindex-1);
            quicksort(arr2,  pindex+1,end);}
       }
     public void display( int arr1[]){
        int l;
        int len=7;
        for(l=0;l<len;l++){
            System.out.println(arr1[l]);
        }
    }
public static  void main(String args[]){
int arr[]=new int[]{8,5,3,4,7,6,23};
sort2 aat=new sort2();
aat.insertsort(arr, 7);
aat.display(arr);
aat.quicksort(arr, 0, 6);
System.out.println("elements after quick sort");
aat.display(arr);
    
    }
}
