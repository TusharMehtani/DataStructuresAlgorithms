//search for a key in a linkedlist using recursion.

class linkedlist{
	private Node head;

	public linkedlist(Node head){
		this.head = head;
	}

	public Node getHead(){
		return this.node;
	}
			
	public void setHead(Node head){
		this.head = head;
	}
	
	public boolean search(int key){
		Node n = this.head;
		boolean bool = false;
		if(n.getData() == key){
			bool = true;
		}
		this.search(n.getNext());
		
	}
}

class Node{
	private int data;
	private Node next;

	public Node(int data){
		this.data = data;
		this.next = next;
	}
	public Node(int data,Node next){
		this.data = data;
		this.next = next;
	}

	public int getData(){
		return this.data;
	}
	public Node getNext(){
		return this.next;
	}

	public void setData(int data){
		this.data = data;
	}
	public void setNext(Node next){
		this.next = next;
	}
}	

class Test{
	Node fourth = new Node(4,null);
	Node third = new Node(3,fourth);
	Node second = new Node(2,third);
	Node head = new Node(1,second);
	linkedlist l = new linkedlist(head);
	System.out.println(l.search(3));	
	
	
}


