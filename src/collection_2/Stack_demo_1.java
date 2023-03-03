package collection_2;

import java.util.Stack;

public class Stack_demo_1 {

	public static void main(String[] args) {
		
		
		Stack<String> str=new Stack<>();
		
		str.push("shashi");
		
		str.push("ghar");
		str.push("charu");
		str.push("sneha");
		str.push("collge");
		System.out.println(str);
		
		str.pop();
		System.out.println(str);
		
		str.remove("ghar");
		
		System.out.println(str);
	}
	
	
	
}
