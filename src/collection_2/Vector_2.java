package collection_2;

import java.util.Enumeration;
import java.util.Vector;

public class Vector_2 {

	public static void main(String[] args) {
		
		Vector<Integer> vec=new Vector<>();
		
		for(int i=1; i<=10; i++)
		{
			vec.add(i);
			
		}
		
		
		Enumeration<Integer> enu=vec.elements();
		
		while (enu.hasMoreElements()) {
	     int i= enu.nextElement();
			if(i%2==0)
		System.out.println(i);
			
		}
		
			
		
	}

	
	
}
