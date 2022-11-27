class treeNode{
	
	int data;// declering data 
    treeNode left,right;//declering node right and left values toroot node 
	
     static treeNode root=null;
public void insert(int data) {
	
	root =insertNode(root,data);
	
	}private treeNode insertNode(treeNode root, int x) {
		if(root==null) {
			treeNode newnode=new treeNode();
			newnode.data=x;
			newnode.right=null;
			newnode.left=null;
			root=newnode;
		}else {
			if(root.left==null) {
				root.left=insertNode(root.left,x);
				
			}else if(root.left!=null) {
                
				root.right=insertNode(root.right,x);
			}else {
                root.left.left=insertNode(root, x);
            }




            
		}
	// TODO Auto-generated method stub
	return root;
    
}public static void main(String[] args){
   treeNode gd=new treeNode();
   gd.insert(8);
  gd.insertNode(root, 99);
  gd.insertNode(root, 77);
  gd.insertNode(root, 66);
  gd.insertNode(root, 90);
  System.out.println(root.data);
  System.out.println(root.right.data);
  System.out.println(root.left.data);
  System.out.println(root.left.left.data);

}
	}
