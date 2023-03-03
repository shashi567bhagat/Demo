package loopInJava;


import java.util.*;

public class ForLoop {
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Digit For Table");
		
		int n=sc.nextInt();
		
		
		int i;
		
		for(i=1;i<=10;i++) {
			
			System.out.println(n + " * " + i  + " = "  +  n*i);
			 
			
		}
		
		
		
		
	}
	
	

}
