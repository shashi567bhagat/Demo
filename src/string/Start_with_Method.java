package string;

public class Start_with_Method {
	
	
public static void main(String[] args) {
	
	String s="Bharat Aluminium Company Limited";
	
	boolean s1=s.startsWith("Bh");
	boolean s2=s.startsWith("Bharat ");
	boolean s3=s.startsWith("bharat");  //case-sensitivity of characters.
	
	boolean s4=s.startsWith("");
	
	System.out.println("******************");
	
	
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	
	System.out.println(s4);
	
	

	
}
	
	
}
