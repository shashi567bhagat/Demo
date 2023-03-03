package string;

public class String_class3 {
	
	
	public static void main(String[] args) {
		
		
		String a=new String("java");
		
		String b=new String("java");
		
		String p="java";
		String q="java";
		
		
		
		System.out.println(System.identityHashCode(p));
		
		System.out.println(System.identityHashCode(q));
		
		
		System.out.println();
		
		System.out.println(a);
		
		System.out.println(b);
		
		a.concat("learning");
		
		System.out.println(a);
		
		System.out.println(System.identityHashCode(a));
		
		System.out.println(System.identityHashCode(b));
		
		System.out.println(a==b);
	}

}
