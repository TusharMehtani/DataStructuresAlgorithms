//linked-list traversal

class linkedlist{
	private Node head;
	
	public linkedlist(Node head){
		this.head= head;
	}
	
	public Node gethead(){
		return this.head;
	}
	
	public void sethead(Node head){
		this.head = head;
	}

	public void print(){
		Node n = this.gethead();
		while(n!=null){
			System.out.println(n.getdata());
			n=n.getnext();
		}
	}
}

class Node{
	private int data;
	private Node next;
	
	public Node(int data){
		this.data = data;
		this.next = null;
	}
	public Node(int data,Node next){
		this.data = data;
		this.next = next;
	}

	public int getdata(){
		return this.data;
	}
	public Node getnext(){
		return this.next;
	}

	public void setdata(int data){
		this.data = data;
	}
	public void setnext(Node next){
		this.next = next;
	}
}

class Test{
	public static void main(String[] args){
		Node head = new Node(12);
		linkedlist llist = new linkedlist(head);
		Node second = new Node(15);
		head.setnext(second);
		Node third = new Node(20);
		second.setnext(third);
		llist.print();
	}
}
