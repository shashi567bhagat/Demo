package MyDemo;

import java.util.*;
public class Test {
	
     static	String firstName="KORBA";
	
     static	String lastName="KUSMUNDA";
     
     static  int a=5;
     
     static  int b=7;
	
     static	double PI=3.14;
	
     static	double MAX_VALUE=Integer.MAX_VALUE;
	
	
	 public static void main(String[] args) {
		
		
		
		additionOfTwoNumber();
		
		System.out.println(firstName);
		
		System.out.println(lastName);
		
		System.out.println(a+b);
		
		System.out.println(PI);
		
		System.out.println(MAX_VALUE);
		
		System.out.println("Subtraction of Two Number is:-   " + subOfTwoNumber());   
		
		
	}
	
	
	public static void additionOfTwoNumber()
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first Number");
		
		int input1=sc.nextInt();
		
		System.out.println("Enter Second Number");
		
		int input2=sc.nextInt();
		
		System.out.println(" Addition Of two no is:-    "+  (input1+ input2));
		
	}
	
	public static int subOfTwoNumber()
	
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first Number");
		
		int input1=sc.nextInt();
		
		System.out.println("Enter Second Number");
		
		int input2=sc.nextInt();
		
		int Result= (input1-input2);
		
		return Result;
		
	}
	
	
	}


