package string;

public class Concat_Method {

	
	
	public static void main(String[] args) {
		
		
		String s1="Bharat ";
		String s2="Aluminium ";
		String s3="Company ";
		String s4="Limited ";
		
		
		
		String s5=s1.concat(s2).concat(s3).concat(s4) ;
		
		String s6=s1.concat(s2) +"   ";
		
		System.out.println(s5);
		System.out.println(s6);
		
	}
}
