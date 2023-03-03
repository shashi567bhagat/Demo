package string;

public class Contains1 {

	
	
	public static void main(String[] args) {
		
		//The contains() method checks whether the specified string (sequence of characters) is present in the string or not
		
		String s="Hello how are you doing";
		
		System.out.println(s.contains("how you are"));//false
		System.out.println(s.contains("how are you"));//true
		System.out.println(s.contains("how youare"));//false
		System.out.println(s.contains("how Youare"));//false
		
		
		System.out.println(s.contains("")); //true
	}
}
