package collection_4_Map;

import java.util.ArrayList;
import java.util.HashMap;

public class Map_3 {
	
	
	
public static void main(String[] args) {
	

	HashMap<Integer, ArrayList<Integer>>hm=new HashMap<>();
	
	ArrayList<Integer> al=new ArrayList<>();
	
	for(int i=100;i<=105;i++)
	{
		al.add(i);
		
		
	}
	
	//System.out.println(al);
	
	
    hm.put(1, al);
    System.out.println(hm);
    System.out.println(hm.size());
	
}
	
	
	
	
}
