package string;

public class Intern_method2 {

	public static void main(String[] args) {
		
		String str = new String("Welcome to JavaTpoint").intern(); // statement - 1  
		
		String str1 = new String("Welcome to JavaTpoint").intern(); // statement - 2  
		
		System.out.println(str1 == str); // prints true  
		
		
		String s1="Welcome to JavaTpoint";
		
		System.out.println(str==s1);
		
		System.out.println(System.identityHashCode(str));
		
		System.out.println(System.identityHashCode(str1));
		
		System.out.println(System.identityHashCode(s1));
		
		
//		String s="hello";
//	    String	s1=s.concat("world");
//		
//		System.out.println(s);
//		System.out.println(s1);
//		System.out.println(System.identityHashCode(s));//1854731462
//		System.out.println(System.identityHashCode(s1));
	}
	
	
}
