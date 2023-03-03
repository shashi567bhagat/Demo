package string;

public class Index_Method5 {
	
	
	//Java String indexOf(String substring, int fromIndex) Method Example 
	
	public static void main(String[] args) {
		String s1 = "This is indexOf method";
		// Passing substring and index
		
		System.out.println(s1.indexOf("method", 10)); // Returns the index of this substring
		
		System.out.println(s1.indexOf("method", 20)); // It returns -1 if substring does not found
		
	}
}
