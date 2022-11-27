 class dsa4 {
    
    static void insert_ele(int arr[],int n,int x,int pos){
        
for(int i=n-1;i>=pos;i--)
arr[i+1]=arr[i];
arr[pos]=x;        
    }public static void main(String[] args){
        int arr[] =new int[15];
    arr[0]=2; 
    arr[1]=3;
    arr[3]=4;
    arr[4]=5;
    arr[5]=6;
    int n=5; //indecates no of elements in the array
    int x=10;
    int pos = 2; // decereaing at which postion the element is inserted
        System.out.print("Before Insertion: ");
        for(int i=0;i<n;i++)
        System.out.print(arr[i] +" ");
        insert_ele(arr, n, x, pos);
        n += 1;  
        System.out.print("\n\nAfter Insertion: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");  
    }
}
