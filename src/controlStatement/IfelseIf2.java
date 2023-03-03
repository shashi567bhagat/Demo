package controlStatement;

import java.util.Scanner;

public class IfelseIf2 {
	
	
	
	public static void main(String[] args) {
		
		
		IfelseIf2.display();
		IfelseIf2.display();
		IfelseIf2.display();
		IfelseIf2.display();
		IfelseIf2.display();
		IfelseIf2.display();
		IfelseIf2.display();
		IfelseIf2.display();
		IfelseIf2.display();
		
		
		
		IfelseIf2.display();
		IfelseIf2.display();
		IfelseIf2.display();
		IfelseIf2.display();
		IfelseIf2.display();
		IfelseIf2.display();
		IfelseIf2.display();
		IfelseIf2.display();
		IfelseIf2.display();
		
		
		
		
		IfelseIf2.display();
		IfelseIf2.display();
		IfelseIf2.display();
		IfelseIf2.display();
		IfelseIf2.display();
		IfelseIf2.display();
		IfelseIf2.display();
		IfelseIf2.display();
		IfelseIf2.display();
		
		
		
		
		
		IfelseIf2.display();
		IfelseIf2.display();
		IfelseIf2.display();
		IfelseIf2.display();
		IfelseIf2.display();
		IfelseIf2.display();
		IfelseIf2.display();
		IfelseIf2.display();
		IfelseIf2.display();
		
		
		
		
		
		
		
		IfelseIf2.display();
		IfelseIf2.display();
		IfelseIf2.display();
		IfelseIf2.display();
		IfelseIf2.display();
		IfelseIf2.display();
		IfelseIf2.display();
		IfelseIf2.display();
		IfelseIf2.display();
		
		
		
		
		
		
		IfelseIf2.display();
		IfelseIf2.display();
		IfelseIf2.display();
		IfelseIf2.display();
		IfelseIf2.display();
		IfelseIf2.display();
		IfelseIf2.display();
		IfelseIf2.display();
		IfelseIf2.display();
		
		
	}	
	
		public static  void  display() 
		{

			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter the value of marks");
			
			int marks=sc.nextInt();
			
			if(marks>100) {
				
				System.out.println("Invalid Input");
			}
			
			else  if(marks>=60 && marks<=100)
		 	
		  {
			System.out.println("First Division");
			
		  }
		
		  else if(marks>=45 && marks<60)
		  {
			System.out.println("Second Division");
			
		  }
		  else if(marks>=33 && marks<45)
		  {
			System.out.println("Third Division");
		  }
		 else if(marks<33 && marks>=0)
		  {
			System.out.println("Fail!!");
		  }
		 else if(marks<0)
		 {
			 System.out.println("Invalid Input");
			 
		 } 
		   
	}
		
	

	
}



