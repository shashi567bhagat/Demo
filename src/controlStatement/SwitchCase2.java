package controlStatement;

import java.util.Scanner;

public class SwitchCase2 {
	
	
	
	public static void main(String[] args) {
		
		
		SwitchCase2.display();
		SwitchCase2.display();
		SwitchCase2.display();
		SwitchCase2.display();

		SwitchCase2.display();
		SwitchCase2.display();
		SwitchCase2.display();
		SwitchCase2.display();
	
		
	}	
		public static void display() {
			
		Scanner sc=new Scanner(System.in);
			
		//System.out.println("E");
			
		int weekends =sc.nextInt();
			
		switch(weekends){
			
		case 1:
			 
		System.out.println(" MONDAY");
		
		break;
			
		case 2:
			
		System.out.println("TUESDAY");
			
		break;
			
		case 3:
			
		System.out.println(" WEDNESDAY");
		
		break;
			
		case 4:
			
		System.out.println("THURSADAY");
			
		break;
			
	    case 5:
			
		System.out.println("FRIDAY");
			
		break;
			
	    case 6:
		
		System.out.println("SATURADY");
		
		break;
		
	    case 7:
		
		System.out.println("SUNDAY");
		
		break;
			
			
		default:  
			 
	    System.out.println("Please give the valid DAY.");  
	         
	    break;  
			
		}
			
		
		
			
		
		
	}

}
