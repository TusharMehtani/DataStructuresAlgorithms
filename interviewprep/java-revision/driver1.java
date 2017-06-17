//an example of method overriding. (runtime polymorphism. refer lect 1.4)
class A{
	A(){
		hello();
	}
 	void hello(){
		System.out.println("Hello in class A");
	}
}
class B extends A{
	B(){
	super();// Also, the hello method in super uses hello of B and nor A.
	}
	void hello(){
		System.out.println("Hello in class B");
	}
}
class driver{

	public static void main(String[] args){
		A a1 = new A();// hello of A is called
		B b1 = new B();// hello of B is called
		a1.hello();// hello of A is called
		b1.hello();// hello of B is called
		a1 = new B();// hello of B is called
		a1.hello();// hello of B is called
	}
}
