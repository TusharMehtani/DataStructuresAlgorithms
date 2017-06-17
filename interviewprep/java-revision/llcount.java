//count number of elements in linkedlist using recursion.

class linkedlist{
	private Node head;
	
	public linkedlist(Node head){
		this.head = head;
	}

	public Node getHead(){
		return this.head;
	}

	public int getCount(Node head){
		if(head==null){
			return 0;
		}
		else{
			return 1+getCount(head.getNext());
		}
	}
	
	public void setHead(){
		this.head= head;
	}

	public void print(){
		Node n = this.getHead();
		while(n!=null){
			System.out.println(n.getData());
			n=n.getNext();
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
	public static void main(String[] args){
		Node head = new Node(1);
		linkedlist llist = new linkedlist(head);
		Node second = new Node(2);
		head.setNext(second);
		Node third = new Node(3);
		second.setNext(third);
		Node fourth = new Node(4);
		third.setNext(fourth);
		fourth.setNext(null);
		System.out.println(llist.getCount(head));
		System.out.println();
	}
}

