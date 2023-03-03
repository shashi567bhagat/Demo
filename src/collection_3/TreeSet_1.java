package collection_3;

import java.util.TreeSet;

public class TreeSet_1 {

	public static void main(String[] args) {

		TreeSet<Integer> tt = new TreeSet<>();

		tt.add(3);
		tt.add(5);
		tt.add(2);
		tt.add(17);
		tt.add(10);
		tt.add(23);
		try {
			tt.add(null);// null value accept nahi karta
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
        tt.add(14);
        
        System.out.println(tt);

	}

}
