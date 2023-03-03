package collection_4_Map;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Deque_1 {

	public static void main(String[] args) {
		
		Deque<String> dq=new ArrayDeque<>();
		dq.add("Amit");  
		dq.add("Vijay");  
		dq.add("Karan");  
		dq.add("Jai");  
		dq.add("Rahul"); 
		
		
		Iterator<String> i=dq.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
	
}
