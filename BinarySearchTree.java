class Node{
    int key;
        Node left;
        Node right;
        
        Node(int val)
        {   
            key = val;
            left = null;
            right = null;
        }}
    
        
        
    
    public class BinarySearchTree
    {
        Node root;
        public Node insert(Node root, int val)
        {
            if(root == null)
                return new Node(val);
            else if(root.key < val)
                root.right = insert(root.right,val);
            else if(root.key > val)
                root.left = insert(root.left,val);
            return root;
        }
      
        
    
        public void inorder(Node root)
        {
            if(root == null)
                return;
    
            inorder(root.left);
            System.out.print(root.key+" ");
            inorder(root.right);
        }
    
        public static void main(String args[])
        {
           BinarySearchTree bst = new BinarySearchTree();
    
           System.out.println("Inserting Element: "+100);
           bst.root = bst.insert(bst.root,100);
           System.out.println("Inserting Element: "+50);
           bst.root = bst.insert(bst.root,50);
           System.out.println("Inserting Element: "+150);
           bst.root = bst.insert(bst.root,150);
           System.out.println("Inserting Element: "+125);
           bst.root = bst.insert(bst.root,125);
    
           System.out.println("Inorder Traversal of Above BST");
           bst.inorder(bst.root);
        }
    }
    