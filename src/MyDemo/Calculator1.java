package MyDemo;

import java.util.Scanner;

public class Calculator1 {
	
	/*
	 * 
	 *this is called documentation comment. 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
	
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first digit");
		
		int int1= sc.nextInt();
		
		System.out.println("Enter 2nd digit");
		
		int int2= sc.nextInt();
		
		System.out.println("which operation you waht to do: "  +  "  addition   " + "  subtraction  " +"  multiflication  " + "  division  ");
	    
		String operation = sc.next();
		
	    
          if(operation.equals("addition"))  {
	    	
	   	System.out.println("Addition of two No is :   " + (int1+int2));
	   	
	    	   }
	    
	  
	    
	    
          else if (operation.equals("subtraction") ) {
		    	
		    	System.out.println("subtraction of two No is :   " + (int1-int2));
		    	
	    	}
	    
	    
	    
	
	 
		    	
          else if( operation.equals("multiflication") ) {
			    	
			    	System.out.println("multiflication of two No is :   " + (int1*int2));
			    	
		    	}
			    	
		    	
		    	
			    	
          else if (operation.equals("division")) 
          {
				    	
				    	System.out.println("division of two No is :  "  +  (int1/int2));
			    	}
	}
	
}
