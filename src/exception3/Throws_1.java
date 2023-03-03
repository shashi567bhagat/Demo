package exception3;

public class Throws_1 {

	
	public static void main(String[] args) throws NullPointerException {
		
		m1();
		System.out.println("i am main method");
	}
	
	
	static void m1()
	{try {
		
		m2();
	}
	
	
	catch(NullPointerException e)
	{
		System.out.println("NullPointerException occured");
	}
	
		
		System.out.println("welcome");
	}
	
	static void m2() 
	{    
		m3();
		String s=null;
		
		System.out.println(s.length());
		
		throw new NullPointerException("exception");
		
	}
	
	static void m3()

	{
		System.out.println("iam method no 3");
		
	}
}
