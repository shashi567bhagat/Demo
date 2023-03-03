package string;

public class Startswith_2_offset {

	
	public static void main(String[] args) {
		
		//startsWith method starting index se given string ko check krta hai
		String s="Bharat Aluminium Company Limited";
		
		boolean s1=s.startsWith("a", 2);
		
		boolean s2=s.startsWith("C", 17);//18 flase 
		
		
		System.out.println(s1);
		System.out.println(s2);
		
	}
}
