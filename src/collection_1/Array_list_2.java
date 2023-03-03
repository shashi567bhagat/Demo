package collection_1;

import java.util.ArrayList;

public class Array_list_2 {

	
	
	public static void main(String[] args) {
		
		
		ArrayList<String> obj=new ArrayList<>();
		
		obj.add("NASA");
				
		obj.add("ISRO");
		
		
		obj.add("PARA SPECIAL");
		obj.add(null);
		
		
		System.out.println(System.identityHashCode(obj.add("NASA")));
		System.out.println(System.identityHashCode(obj.add("ISRO")));
		System.out.println(System.identityHashCode(obj.add("PARA SPECIAL")));
		
		System.out.println(System.identityHashCode(obj.add(null)));
		
		System.out.println(obj);
		
		//System.out.println(obj.get(12));
		
		//System.out.println(obj.get(5));
		//System.out.println(obj.size());
	}
}
