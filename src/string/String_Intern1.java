package string;

public class String_Intern1 {
public static void main(String[] args) {
	
	
	String s= new String("hello");
	
	String s1=s.intern();
	
	String s2="hello";
	
	System.out.println(s==s1); // false
	
	System.out.println(s1==s2);// true
	
	System.out.println(s.equals(s1));//true
	
	System.out.println(s1.equals(s2));//true
	
}

	
	
}
