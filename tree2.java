class Node{
	int data;
	Node left;
	Node right;
	public Node(int data) {
		this.data=data;
		
	}
}
public class tree2 {

	
		
	public static void preorder(Node n) {
	if(n==null) {
		return;
	
	}System.out.println(n.data);
	preorder(n.left);
	preorder(n.right);
	}public static void inorder(Node n) {
        if(n==null){
            return;
        }
		inorder(n.left);
        System.out.println(n.data);
        inorder(n.right);
	}public static void postorder(Node n) {
        if(n==null){
            return;
        }postorder(n.left);
        postorder(n.right);
        System.out.println(n.data);
		
	}public static  Node createData() {
		Node a=new Node(1);
		Node b=new Node(2);
		Node c=new Node(3);
		Node d=new Node(4);
		Node e=new Node(5);
		Node f=new Node(6);
		Node h=new Node(7);
		a.left=b;
		a.right=c;
		b.left=d;
		b.right=e;
		d.left=f;
		c.right=h;
		return a;
				
				
	}public static void main(String[] args) {
		Node data = createData();
		preorder(data);
        inorder(data);
        postorder(data);
    }
}

