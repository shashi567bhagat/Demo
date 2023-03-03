package collection_4_Map;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Deque_2 {

	public static void main(String[] args) {
		
		Deque<String> dd=new ArrayDeque<>();
		dd.add("Arvind");
		dd.add("Vimal");
		dd.add("Mukul");
		dd.add("Jai");
		dd.add("element");
		dd.add("apple");
		
	    Iterator<String> ss=dd.iterator();
	    
	    while(ss.hasNext())
	    {
	    	System.out.println(ss.next());
	    }
	    
	    System.out.println("*******************");
	  System.out.println(dd.peekFirst());  
	   System.out.println(dd.peekLast()); 
	   
	   System.out.println("********************");
	   
	   
	  dd.offerFirst("Jai");
	  dd.offerLast("Arvind");
	   
	   for(String s:dd)
	   {
		   System.out.println(s);
	   }
	   
	   System.out.println("*******");
	   dd.pollFirst();
	   dd.pollLast();
	   
	   for(String s:dd)
	   {
		   System.out.println(s);
	   }
	}
	
}
