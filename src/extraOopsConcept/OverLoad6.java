package extraOopsConcept;

import java.util.Scanner;

public class OverLoad6 {
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		OverLoad6 obj=new OverLoad6();
		
		System.out.println("enter int type integer value");

	    System.out.println("integer value Result  " + (obj.sumoftwonumber(sc.nextInt(),sc.nextInt())));
	    
	    
		
		System.out.println("enter double type integer value"); 
		
		System.out.println( "double value Result  " +(obj.sumoftwonumber(sc.nextDouble(), sc.nextDouble())));;
		
		
		
        System.out.println("enter string type  value"); 
		
		System.out.println( "string type Result  " +(OverLoad6.sumoftwonumber( sc.next(), " "   + sc.next())));;
			
	}
	
	public	int sumoftwonumber(int a,int b)
	{   
		
		
		
		int sum=a+b;
		return sum;
	}
	
	public	 double sumoftwonumber(double a, double b)
	{
		
		
		double sum=a+ b;
		
		return sum;
	}
	
	public	static String  sumoftwonumber(String a, String b)
	{
		
		
		String sc= a + b;
		
		return sc;
	}
	
	
}

