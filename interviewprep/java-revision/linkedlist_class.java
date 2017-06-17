import java.util.*;

class Test{
	public static void main(String[] args){
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		int i=0;
		for(i=0;i<l.size();i++){
			System.out.println(l.get(i));
		}
		l.remove(2);
		System.out.println("Removing element from 3rd position: ");
		for(i=0;i<l.size();i++){
			System.out.println(l.get(i));
		}
		System.out.println("Adding 5 at position 3: ");
		l.add(2,5);
		for(i=0;i<l.size();i++){
			System.out.println(l.get(i));
		}
		System.out.println("LinkedList traversal using ListIterator.");
		ListIterator litr = l.listIterator();
		while(litr.hasNext()){
			System.out.println(litr.next());
		}
	}
}
