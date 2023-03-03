package string;

public class Strng_Immutable2 {

	public static void main(String[] args) {
		String TCS="product";
		String WIPRO="product";
		String INFOSYS="product";
		
		System.out.println(TCS==WIPRO);
		
		System.out.println(TCS==INFOSYS);
		
		System.out.println(INFOSYS==WIPRO);
		
		TCS.concat("value");
		
		System.out.println(TCS);
		
		
	}
	
	
	
	
	
}
