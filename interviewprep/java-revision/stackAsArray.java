//Array implementation of stack.
import java.util.*;
class stackAsArray{
	private int top;
	private int a[] = new int[1000];

	public stackAsArray(){
		top = -1;
	}
	public boolean isEmpty(){
		if(this.top == -1){
			return true;		
		}
		else{
			return false;
		}
	}
	public int push(int ele){
		if(this.top>=1000){
			System.out.println("Stack overflow error!");
			return -1;
		}
		else{
			this.top++;
			this.a[this.top] = ele;
			return ele;
		}
	}
	public int pop(){
		if(this.isEmpty()){
			System.out.println("Stack underflow error!");
			return -1;
		}
		else{
			int x = this.a[this.top];
			this.top--;
			return x;
		}
	}
	public int peek(){
		if(this.isEmpty()){
			System.out.println("Stack underflow error!");
			return -1;
		}
		else{
			return this.a[this.top];
		}
	}
	public int search(int key){
		if(this.isEmpty()){
			System.out.println("Stack underflow error!");
			return -1;
		}
		else{
			return Arrays.binarySearch(this.a,key)+1;
		}
	}
	public void printStack(){
		for(int i=0;i<=this.top;i++){
			System.out.print(this.a[i]+"\t");
		}
		System.out.println();
	}
}
class Test{
	public static void main(String[] args){
		stackAsArray s = new stackAsArray();
		System.out.println(s.isEmpty());
		System.out.println("Pushing 1 into stack:");
		System.out.println(s.push(1));
		s.printStack();
		System.out.println("Peeking into stack: ");
		System.out.println(s.peek());
		s.printStack();
		System.out.println("Pushing 2 into stack:");
		System.out.println(s.push(2));
		s.printStack();
		System.out.println("Peeking into stack: ");
		System.out.println(s.peek());
		s.printStack();
		System.out.println("Pushing 3 into stack:");
		System.out.println(s.push(3));
		s.printStack();
		System.out.println("Peeking into stack: ");
		System.out.println(s.peek());
		s.printStack();
		System.out.println("Pushing 4 into stack:");
		System.out.println(s.push(4));
		s.printStack();
		System.out.println("Peeking into stack: ");
		System.out.println(s.peek());
		s.printStack();
		System.out.println("Searching for 4 in the stack:");
		System.out.println(s.search(4));
		System.out.println("Searching for 3 in the stack:");
		System.out.println(s.search(3));
		System.out.println("Searching for 2 in the stack:");
		System.out.println(s.search(2));
		System.out.println("Searching for 1 in the stack:");
		System.out.println(s.search(1));
		System.out.println("Poping element from stack:");
		System.out.println(s.pop());
		s.printStack();
		System.out.println("Peeking into stack:");
		System.out.println(s.peek());
		s.printStack();
		System.out.println("Poping element from stack:");
		System.out.println(s.pop());
		s.printStack();
		System.out.println("Peeking into stack:");
		System.out.println(s.peek());
		s.printStack();
		System.out.println("Poping element from stack:");
		System.out.println(s.pop());
		s.printStack();
		System.out.println("Peeking into stack:");
		System.out.println(s.peek());
		s.printStack();
		System.out.println("Poping element from stack:");
		System.out.println(s.pop());
		s.printStack();
		System.out.println("Peeking into stack:");
		System.out.println(s.peek());
		s.printStack();
	}
}
