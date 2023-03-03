package MyDemo;

import java.util.Scanner;



/*this class is related to calculation.
 * it perform addition , subtraction, multiplication and division.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */

public class Calculator3 {
	
	
	
	
	public static void main(String[] args) {
		
		display();
		display();
		display();
		display();
		display();
		display();
		display();
//		Calculator3.display();
//		
//		Calculator3.display();
//		Calculator3.display();
//		
//
//		Calculator3.display();
//		
//		Calculator3.display();
//		Calculator3.display();
//		
//
//		Calculator3.display();
//		
//		Calculator3.display();
//		Calculator3.display();
//		
//
//		Calculator3.display();
//		
//		Calculator3.display();
//		Calculator3.display();
		
	}	
		     
	
	
	       
	
	     public static void display() {
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter first digit");
			
	     	int int1= sc.nextInt();
			
			System.out.println("Enter 2nd digit");
			
			int int2= sc.nextInt();
			
			int int3= int1+int2;
			
			int int4=(int1-int2);

			int int5=(int1*int2);
			
			int int6= (int1/int2);
			
			
			
			
			
		System.out.println("which operation you waht to do: "  +  "  addition   " + "  subtraction  " +"  multiflication  " + "  division  ");
		
		String ab=sc.next();
		
			if("addition".equals(ab))
		{
	    	System.out.println("addition of two no is:    "+  int3);
	    	
	    }
		
		
		
		else if("subtraction".equals(ab))
		{
	    	System.out.println("subtraction of two no is:    "+  int4);
	    	
	    }
		
	    
	    else if("multiflication".equals(ab))
		{
	    	System.out.println ( int1*int2);
	    	
	    }
		
	
		else	 if("division".equals(ab))
		{
	    	System.out.println("division of two no is:    "+  int6);
	    	
	    }
		
		}
		
		
	}
	
	
	
	
		

		
		
