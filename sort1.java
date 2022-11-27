public class sort1 {
    
     
    public void selectionsort(int arr[],int size)
    {
        int i,j;
        for(i=0;i<size-1;i++){
          for(j=i+1;j<size;j++){
            if(arr[i]>arr[j]){
                int temp;
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                System.out.println(arr[i]);
            }
          }
        }//display();
} public void bubblesort(int arr2[],int gap){
int k;
int v;
for(k=0;k<gap-1;k++){
    for(v=0;v<gap-1-k;v++){
        if(arr2[v]>arr2[v+1]){
          int temp;
          temp=arr2[v];
          arr2[v]=arr2[v+1];
          arr2[v+1]=temp;
          System.out.println("for every pass elements");
          //display(arr2);
         // System.out.println(arr2[k]);



        }
    }
}



}




public void display( int arr1[]){
    int l;
    int len=6;
    for(l=0;l<len;l++){
        System.out.println(arr1[l]);
    }
}




public static void main(String[] args){
        int arr[]=new int[]{8,4,3,7,5,12};
        sort1 map=new sort1();
        map.selectionsort(arr,6);
        map.display(arr);
        map.bubblesort(arr, 6);
        System.out.println("buble sort");
        
        map.display(arr);
        
    }
}
