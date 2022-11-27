class Node{
 int data;
    Node left;
    Node right;
     Node(int val){
        data=val;
        left=null;
        right=null;
    }
}

public class tree3 {
      Node root;
    public Node insert(Node root,int val){
        if (root==null)
           return new Node(val);
        else if(root.data< val)
         root.right = insert(root.right,val);
        else if(root.data > val)
        root.left = insert(root.left,val);
    return root;
        }
        
        
    public void inorder(Node root){
            if(root==null){
                return;
            }inorder(root.left);
             System.out.println(root.data);
            inorder(root.right);
        }public static void main(String args[]){
            tree3 gap=new tree3();
           gap.root= gap.insert(gap.root, 100);
            gap.root=gap.insert(gap.root, 44);
            gap.root=gap.insert(gap.root, 50);
            gap.root=gap.insert(gap.root,150);
          gap.root=  gap.insert(gap.root, 125);
           // gap.insert(gap.root, 34);
            gap.inorder(gap.root);
        }
    
    
    }
