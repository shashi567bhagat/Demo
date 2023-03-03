package controlStatement;

import java.util.Scanner;




//    CLASS -10 CONTROL STATEMENT 2
/*
 * Java Switch Statements
   Instead of writing many if..else statements, you can use the switch statement.

   The switch statement selects one of many code blocks to be executed:
 *  
 *  
 *  switch(expression) {
  case x:
    // code block
    break;
  case y:
    // code block
    break;
  default:
    // code block
    }


 *  Note that if the default statement is used as the last statement in a switch block, it does not need a break.  
 *  The switch expression is evaluated once.
    The value of the expression is compared with the values of each case.
    If there is a match, the associated block of code is executed.
    The break and default keywords are optional, and will be described later in this chapter
 *  
 *  
 *  
 *  
 *  The break Keyword
   When Java reaches a break keyword, it breaks out of the switch block.

   will stop the execution of more code and case testing inside the block.

   When a match is found, and the job is done, it's time for a break. There is no need for more testing.
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * */

public class SwitchCase3 {
	
	
 public static void main(String[] args) {
		
	SwitchCase3.months();
	
	SwitchCase3.months();
	
	SwitchCase3.months();
	SwitchCase3.months();
	SwitchCase3.months();
	SwitchCase3.months();
	SwitchCase3.months();
	SwitchCase3.months();
	
	
    SwitchCase3.months();
	
	SwitchCase3.months();
	
	SwitchCase3.months();
	SwitchCase3.months();
	SwitchCase3.months();
	SwitchCase3.months();
	SwitchCase3.months();
	SwitchCase3.months();
	
		
	}	
		public static void months() {
			
		Scanner sc=new Scanner(System.in);
			
		//System.out.println("E");
			
		int months =sc.nextInt();
			
		switch(months){
			
		case 1:
			 
		System.out.println(" january");
		
		break;
			
		case 2:
			
		System.out.println("february");
			
		break;
			
		case 3:
			
		System.out.println(" march");
		
		break;
			
		case 4:
			
		System.out.println("april");
			
		break;
			
	    case 5:
			
		System.out.println("may");
			
		break;
			
	    case 6:
		
		System.out.println("june");
		
		break;
		
	    case 7:
		
		System.out.println("july");
		
		break;
			
		
	    case 8:
			
		System.out.println("august");
				
	    break;
				
		case 9:
			
		System.out.println("september");
			
		break;
			
	    case 10:
			
		System.out.println("october");
			
	    break;
				
			
		case 11:
				
	    System.out.println("november");
				
	    break;
				
	    case 12:
				
	    System.out.println("december");
				
		break;
			
		default:  
			 
	    System.out.println("Please give the valid months.");  
	         
	    break;  
			
		}
			
		}	

}
