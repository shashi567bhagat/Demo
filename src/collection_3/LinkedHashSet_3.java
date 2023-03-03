package collection_3;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet_3 {

	
	public static void main(String[] args) {
		
		LinkedHashSet<String> lhs=new LinkedHashSet<>();
		
		lhs.add("Ravi");
		lhs.add("shyam");
		
		lhs.add("Rose");
		
		lhs.add("Rose");
		
		
		
		
		Iterator<String> i=lhs.iterator();
		
	   while(i.hasNext())
	   {
		   System.out.println(i.next());
		   
	   }
	   
	   
	   System.out.println(System.identityHashCode(lhs.add("Ravi")));
	   
	   System.out.println(System.identityHashCode(lhs.add("shyam")));
	   
	   System.out.println(System.identityHashCode(lhs.add("Rose")));
	   
	   System.out.println(System.identityHashCode(lhs.add("Rose")));
	   
	   
	   
	}
}
