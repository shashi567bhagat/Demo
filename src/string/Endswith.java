package string;

public class Endswith {

	
	public static void main(String[] args) {
		
		String s="Bharat Aluminium Company Limited";
		
		boolean s1=s.endsWith("ed");	
		boolean s2=s.endsWith("Company");
		
		boolean s3=s.endsWith("Limited");
		boolean s4=s.endsWith("");
		
		
		System.out.println(s1);
		
		System.out.println(s2);
		
		System.out.println(s3);
		
		System.out.println(s4);
		
	}
	
	
}
