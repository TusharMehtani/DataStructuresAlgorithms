//introduction to stack class provided by java.

import java.util.Stack;

class Test{
	public static void main(String[] args){
		Stack<Integer> stack = new Stack<Integer>(); //creating an empty stack 										of integers
		System.out.println(stack.empty());
		stack.push(2);
		stack.push(1);
		stack.push(5);
		stack.push(4);
		System.out.println(stack.empty());
		System.out.println(stack.peek());
		System.out.println(stack.search(4));
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.empty());
	}
}
