package string;

public class Stringclass1 {

	

	private static int i;

	public static void main(String[] args) {
		
//		
//		String s1 = "";
//
//		String s2 = "abc";
//
//		String s5 = "IPL";

//		String s6 = "IPL";

		String ss = "welcome";
		String s3 = new String("abc");
           s3.concat(ss);
           
           System.out.println(s3);
	    String sb= s3.concat(ss);//heap memory me store ho rha hai
	
	   
	    System.out.println(sb);

		System.out.println(s3);

		
		String sb1="abcwelcome";
		
		System.out.println(sb==sb1);
		
		System.out.println(sb.equals(sb1));
	
		System.out.println(System.identityHashCode(sb));
		
		System.out.println(System.identityHashCode(sb1));
//		String s7 = s3;
//
//		for (int i = 0; i <= 10; i++) {
//
//		}
//
//		System.out.println(s3 == s7);
//		// System.out.println(s7==s3);
//
//		System.out.println(s7.equals(s3));
//
//		// In the above example, we have seen that whenever we use a new operator to
//		// create a string it creates a new string object in the Java heap.
//		// We can forcefully stop this feature by using the intern() method of the
//		// String class.
//
//		String s4 = new String("abc").intern();// s1==s3
//
//		//
//
//		System.out.println(System.identityHashCode(s1));
//
//		System.out.println(System.identityHashCode(s2));
//
//		System.out.println(System.identityHashCode(s3));
//
//		System.out.println(System.identityHashCode(s4));
//
//		System.out.println(System.identityHashCode(s5));
//
//		System.out.println(System.identityHashCode(s6));
//
//		System.out.println(System.identityHashCode(s7));
//
//		System.out.println("---------------------------------------");
//
//		System.out.println(Integer.toHexString(s1.hashCode()));
//
//		System.out.println((s2.hashCode()));
//
//		System.out.println(Integer.toHexString(s3.hashCode()));
//
//		System.out.println(Integer.toHexString(s4.hashCode()));
//
//		System.out.println("----------------------------------------");
//
//		System.out.println(s1 == s2);
//
//		System.out.println(s1 == s4);
//
//		System.out.println(s3 == s4);
//
//		System.out.println("---------------------------------------");
//
//		System.out.println(s1.equals(s2));
//		System.out.println(s3.equals(s4));

	}
}
