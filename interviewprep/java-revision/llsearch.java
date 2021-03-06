//search for a given element x in a linked list(iterative). return true if ll conatins x, false othervise.

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

	public boolean search(int key){
		Node n = this.head;
		while(n!=null){
			if(n.getdata()==key){
				return true;
			}
			else{
				n=n.getnext();
			}
		}
		return false;
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
		Node head = new Node(1);
		linkedlist llist = new linkedlist(head);
		Node second = new Node(2);
		head.setnext(second);
		Node third = new Node(3);	
		second.setnext(third);
		Node fourth = new Node(4);
		third.setnext(fourth);
		fourth.setnext(null);
		llist.print();
		System.out.println();
		System.out.println(llist.search(3));
		System.out.println(llist.search(0));
	}
}
