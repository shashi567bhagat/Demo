package collection_1;

import java.util.LinkedList;

public class Linklist_1 {

	public static void main(String[] args) {
		
	LinkedList<String> ll =new LinkedList<>();
	
	
	System.out.println("list of Country");
	ll.add("pihu");
	ll.add("prisha");
	ll.add("India");
	ll.add("America");
	
	ll.add(null);
	//System.out.println("Initial LinkedList " + ll);
	
	//ll.remove(1);
	
	//System.out.println("After the Index Remove" + ll);
	
	//ll.remove("India");
	
	System.out.println(ll);
	
	//System.out.println(ll.offer("pihu"));;
	
	//System.out.println(ll.peek());//bydefault ye 1st elements peek krta hai
	
	//System.out.println(ll.peekFirst());
	
	System.out.println(ll.peekLast());
	
	System.out.println(ll.poll());// first element ko nikal deta hai aur usko remove kr deta hai us list se
	
	System.out.println(ll);
	
	System.out.println(ll.pollFirst());
	
	System.out.println(ll);
	
	System.out.println(ll.pollLast());
	
	System.out.println(ll);
		
	}
	
	
}
