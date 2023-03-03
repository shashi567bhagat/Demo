package controlStatement;

import java.util.Scanner;

public class ControlStatementFor {

	
public static void main(String[] args) {
	
	
	
   Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the Input");
	
	int input= sc.nextInt();
	
	for(int i=0; i<input;i++)
	{
		for(int j=1; j<i+1; j++) {
			
			System.out.print("*");	
		}
	
		

	
	System.out.println("*");
	
	}
	
}
	
	
}

	

