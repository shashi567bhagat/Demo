package string_buffer;

public class String_Buffer_common {

	
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("hello");
		sb.append(" world");
		sb.insert(5, " pankaj");
		
		
		System.out.println(sb);
		
		sb.replace(2, 5, "baby");
		
	    System.out.println("After Replace the Value of sb is: " + sb);
	
	
	
	
	
	
		
		
		
		
	}
}
