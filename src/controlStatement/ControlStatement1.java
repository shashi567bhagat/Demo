package controlStatement;

import java.util.*;
public class ControlStatement1 {

	
	public static void main(String[] args) {
		
		Scanner Obj=new Scanner(System.in);
		
		System.out.println("Enter the age");
		
		int age=Obj.nextInt();
		
		if(age>=18) {
			
	    System.out.println("Person is:-------->Allowed to Work In BALCO  "); 
			
			
		}
		else
		{
		 System.out.println("Person is:-----------> Not Allowed to Work In BALCO");
			
			
		}
		
		
	}
}

