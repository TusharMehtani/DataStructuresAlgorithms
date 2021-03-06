
class linkedlist{
	private Node head;
	
	public linkedlist(Node head){
		this.head = head;
	}
	
	public Node gethead(){
		return this.head;
	}

	public void sethead(Node head){
		this.head = head;
	}
}
class Node{
	private int data;
	private Node node;

	Node(int data){
		this.data = data;
		this.node = null;
	}
	Node(int data,Node node){
		this.data =data;	
		this.node = node;
	}

	public int getdata(){
		return this.data;
	}
	public Node getnode(){
		return this.node;
	}

	public void setdata(int data){
		this.data =data;
	}
	public void setnode(Node node){
		this.node = node;
	}
}

class Test{
	public static void main(String[] args){
		Node head = new Node(10);
		linkedlist llist = new linkedlist(head);
		Node second = new Node(20);
		Node third = new Node(30);
		head.setnode(second);
		second.setnode(third);
		third.setnode(null);

		System.out.println("Linked list llist:");
		//System.out.println(llist.gethead().getdata());
		System.out.print("Head: "+llist.gethead().getdata()+" link: ");
		System.out.print("---->");
		System.out.print("Second: "+llist.gethead().getnode().getdata()
		+" link: "+"---->Third: "+llist.gethead().getnode().getnode().getdata()+"---->NULL");
		System.out.println();
	}
}
