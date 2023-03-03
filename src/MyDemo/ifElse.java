package MyDemo;

import java.util.Scanner;

public class ifElse {

	
	
	public static void main(String[] args) {
		int marks;
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Marks:  "  );
     	marks=sc.nextInt();
	
		
	   
	      
	    if(marks>=60 && marks<=100){  
	        System.out.println("1ST DIVISION");  
	        
	    }  
	    else if(marks>=45 && marks<60){  
	        System.out.println("2ND DIVISION"); 
	        
	    }  
	    else if(marks>=33 && marks<45){  
	        System.out.println("3RD DIVISION");  
	    }  
	     
	    else{  
	        System.out.println("FAIL!");  
	    }  
		
		
		
	}
}
