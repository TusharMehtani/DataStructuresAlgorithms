//inserting a node in a linked list

class linkedlist{
	private Node head;

	public linkedlist(Node head){
		this.head = head;
	}

	public Node gethead(){
		return this.head;
	}

	public void sethead(Node head){
		this.head=head;
	}

	public void print(){
		Node n = this.gethead();
		while(n!=null){
			System.out.println(n.getdata());
			n=n.getnext();
		}
	}

	public void insert_start(Node node){
		node.setnext(head);
		this.sethead(node);
	}

	public void insert_pos(Node node,Node prev,Node next){
		prev.setnext(node);
		node.setnext(next);
	}

	public void insert_end(Node node,Node last){
		last.setnext(node);
		node.setnext(null);
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
		Node head = new Node(1);
		linkedlist llist = new linkedlist(head);
		Node second = new Node(2);
		head.setnext(second);
		Node fourth = new Node(4);
		second.setnext(fourth);
		fourth.setnext(null);
		llist.print();
		System.out.println();
		Node third = new Node(3);
		llist.insert_pos(third,second,fourth);
		llist.print();
		System.out.println();
		Node zeroth = new Node(0);
		llist.insert_start(zeroth);
		System.out.println();
		llist.print();
		Node fifth = new Node(5);
		llist.insert_end(fifth,fourth);
		System.out.println();
		llist.print();
		System.out.println();
	}
}
