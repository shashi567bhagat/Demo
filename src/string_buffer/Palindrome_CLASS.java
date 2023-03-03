package string_buffer;

import java.util.Scanner;

public class Palindrome_CLASS {

	public static void main(String[] args) {
		
//		
//		Scanner sc=new Scanner(System.in);
//		
//		String str=sc.nextLine();
//		
//		System.out.println(str);
//		
//		String result="";
//		
//		System.out.println("hii");
//		for(int i=str.length()-1;i>=0;i--)
//			
//		{
//			
//			result=result+str.charAt(i);
//	    }
//		System.out.println(result);
//		
//		if(str.equals(result))
//		{
//			
//			System.out.println("this is palindrome");
//		}
//		else
//		{
//			System.out.println("not palindrome");
//		}
//		
		
		StringBuffer sb=new StringBuffer("ABCDCB");
		
		
		System.out.println(sb);
		
		StringBuffer sb1=sb.reverse();
		
		
		System.out.println(sb1);
		
		
		System.out.println(sb.equals(sb1));
		
		if(sb.equals(sb1))
		{
			
			System.out.println("this is palindrome");
		}
		else
			
		{
			System.out.println("not palindrome");
		}
		
		
		
	}
	
}
