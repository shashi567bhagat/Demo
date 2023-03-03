package collection_2;

import java.util.Enumeration;
import java.util.Vector;

public class Vector_1 {

	public static void main(String[] args) {

		Vector<String> v = new Vector<>();

		v.add("shashi");

		v.add("neha");
		v.add("ram");
		v.add("shyam");
		v.add(null);

		v.add("shashi");

		v.add("neha");
		v.add("ram");
		v.add("shyam");
		v.add(null);
		
		v.add("neha");
		v.add("ram");
		v.add("shyam");
		
		v.add("shashi");

		v.add("neha");
		v.add("ram");
		v.add("shyam");
		v.add(null);

		v.add("shashi");

		v.add("neha");
		v.add("ram");
		v.add("shyam");
		
		System.out.println(v.size());
		//System.out.println(v);
		System.out.println(v.capacity());
		v.insertElementAt("sahu", 22);
		//System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.capacity());
		
		Enumeration<String> e=v.elements();
		
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
			
		}
	}
}
