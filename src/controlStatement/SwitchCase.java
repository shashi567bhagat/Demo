package controlStatement;

import java.util.*;


public class SwitchCase {
	
	public static void main(String[] args) {
		
		
		SwitchCase.display();	
		
		SwitchCase.display();	
		
		
		SwitchCase.display();	
		
		
		SwitchCase.display();	
	}
	
	
		public static void display() {
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter The Age");
			
			int age=sc.nextInt();
			
		switch(age){
			
		 case 18:
			System.out.println("You are under 18.");
		
			break;
			
		case 65:
			
			System.out.println("You are senior citizen.");
			
			break;
			
		 default:  
			 
             System.out.println("Please give the valid age.");  
             break;  
			
		}
			
		
		
		
	}
	
	

}
