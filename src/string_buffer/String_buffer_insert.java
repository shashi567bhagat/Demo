package string_buffer;

public class String_buffer_insert {

	
public static void main(String[] args) {
		
		StringBuffer sb=new StringBuffer("hello ");
		
		
		System.out.println(sb.append(" world"));
		
		
		System.out.println(sb.length());
		
		System.out.println(sb.insert(12, " nature"));
		
		System.out.println(sb.insert(10, 'S'));
		
		StringBuffer sb1=new StringBuffer("abcdefgh");
		
		System.out.println(sb1.replace(2, 5, "environment"));
		

	
}
}