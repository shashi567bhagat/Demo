package collection_4_Map;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_2 {

	
	public static void main(String[] args) {
		
		Queue<Integer> obj=new PriorityQueue<Integer>();
		
		for(int i=1;i<=10;i++) {
		
			obj.add(i);
		}
		
		
		System.out.println(obj);
		
		System.out.println(System.identityHashCode(obj));
		
		System.out.println(System.identityHashCode(obj.add(1)));
		System.out.println(System.identityHashCode(obj.add(2)));
		System.out.println(System.identityHashCode(obj.add(3)));
		System.out.println(System.identityHashCode(obj.add(4)));
		
		System.out.println(System.identityHashCode(obj.add(5)));
		
	
		
		Queue<String> q=new PriorityQueue<String>();
		
		q.add("india");
		q.add("shashi");
		q.add("mango");
		System.out.println(System.identityHashCode("address of object  "+q));
		System.out.println(System.identityHashCode(q.add("india")));
		System.out.println(System.identityHashCode(q.add("shashi")));
		System.out.println(System.identityHashCode(q.add("mango")));
		System.out.println(q);
		
		
	}
	
	
}
