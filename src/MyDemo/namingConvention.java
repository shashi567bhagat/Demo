package MyDemo;

import java.util.Scanner;

public class namingConvention {
	
	String firstName="";
	
	String lastName="";
	
	double PI=3.14;
	
	double MAX_VALUE=Integer.MAX_VALUE;
	
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		
		//Addition Of Two NO
		
		System.out.println("For Addition Of Two No :-   ");
		
		System.out.print("Enter First NO:-   ");
		
		int number1=sc.nextInt();
		
		System.out.print("Enter Second NO:-   ");
		
		int number2=sc.nextInt();
		
		
        System.out.print("Addition Of Two NO :-  "  );
		
		System.out.println(additionOfTwoNumber(number1,number2));
		
		
		
		//Addition of Three NO
		
		System.out.println("Now For Addition Of Three NO  " );
		
		System.out.print("Enter Fist NO:-  ");
		
		int number3=sc.nextInt();
		
		System.out.print("Enter Second NO:-  ");
		
		int number4=sc.nextInt();
		
		System.out.print("Enter Third NO:-  ");
		
		int number5=sc.nextInt();
		
		
		System.out.print("Addition of Three NO:-   ");
		
		System.out.print(additionOfThreeNumber(number3,number4,number5));
		
	}
 
	
	public static int additionOfTwoNumber(int number1, int number2) {
		
		int result1 =number1+number2;
		
		return result1;
	}
	
	

	
		
		public static int additionOfThreeNumber(int number3, int number4, int number5) {
			
			int result2 =number3+number4+number5;
			
			return result2;
			
			
		
		
	}
	
	
	
}
