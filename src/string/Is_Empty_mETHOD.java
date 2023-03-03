package string;

public class Is_Empty_mETHOD {

	public static void main(String[] args) {
		
	String s1="shashi";
	
	String s2="                 ";
	
	System.out.println(s2.isEmpty());//lenght ko consider krta hai agar kuch likha na ho to bhi
	
	System.out.println(s2.isBlank());// ye bas kuch likha hai ya nai ye check krta hai space ka length ko consider nai karta
		
	}
	
	
	
}
