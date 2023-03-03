package string_buffer;

public class String_Biffer1_append {

	public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("hello ");
		
		
		System.out.println(sb.append(" world"));
		
		
		System.out.println(sb.length());
		
		System.out.println(sb.insert(12, " nature"));
	}
	
	
	
	
}
