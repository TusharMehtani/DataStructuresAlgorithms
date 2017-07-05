//implementation of binary tree using java. Binary Tree is a tree whose each node can have at most 2 children.

class Node{
	private int data;
	private Node left;
	private Node right;

	public Node(int data){
		this.data = data;
		this.left = null;
		this.right = null;	
	}

	public int getData(){
		return this.data;
	}
	public Node getLeft(){
		return this.left;
	}
	public Node getRight(){
		return this.right;
	}

	public void setData(int data){
		this.data = data;
	}
	public void setLeft(Node left){
		this.left = left;
	}
	public void setRight(Node right){
		this.right = right;
	}
}

class BinaryTree{
	private Node root;

	public BinaryTree(){
		this.root = null;
	}

	public Node getRoot(){
		return this.root;
	}

	public void setRoot(Node root){
		this.root = root;
	}
}

class BinaryTreeTest{
	public static void main(String[] args){
		Node root = new Node(1);
		Node left1 = new Node(2);
		Node right1 = new Node(3);
		Node leaf1_left1 = new Node(4);
		Node leaf2_left1 = new Node(5);
		root.setLeft(left1);
		root.setRight(right1);
		left1.setLeft(leaf1_left1); 
		left1.setRight(leaf2_left1);
		BinaryTree btree = new BinaryTree();
		btree.setRoot(root);
		System.out.println("Let us check out the tree we have built: ");
		System.out.print(btree.getRoot().getData()+" ");
		System.out.print(btree.getRoot().getLeft().getData()+" ");
		System.out.print(btree.getRoot().getRight().getData()+" ");
		System.out.print(btree.getRoot().getLeft().getLeft().getData()+" ");
		System.out.print(btree.getRoot().getLeft().getRight().getData()+" ");
	}
}
