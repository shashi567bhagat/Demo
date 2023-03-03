package operators;

/*   Java Assignment Operators
Assignment operators are used in Java to assign values to variables. For example,

 int age;
 age = 5;
 Here, = is the assignment operator. It assigns the value on its right to the variable on its left. That is, 5 is assigned to the variable age.

 Let's see some more assignment operators available in Java.

              Operator	Example	  Equivalent to
            
                   =	 a = b;	      a = b;
                   +=	 a += b;	  a = a + b;
                   -=	 a -= b;	  a = a - b;
                   *=	 a *= b;	  a = a * b;
                   /=	 a /= b;	  a = a / b;
                   %=	 a %= b;	  a = a % b;
 * 
 * 
 * 
 * 
 * */




public class AssiggnmentOperator {
	
	
	
	public static void main(String[] args) {
	    
	    // create variables
	    int a = 5;
	    int X;

	    // assign value using =
	    X = a;
	    System.out.println("X using = : " + X);

	    // assign value using +=
	    X += a;
	    System.out.println("X using += : " + X);
	    
	    // assign value using -=
	    X -= a;
	    System.out.println("X using -= : " + X);

	    // assign value using *=
	    X *= a;
	    System.out.println("X using *= : " + X);
	    
	   
	    
    // assign value using /=
        X /= a;
	    System.out.println("X using /= : " + X);
	    
	 // assign value using %=
	    X %= a;
	    System.out.println("X using %= : " + X);
	    
	    
	    
	 // assign value using &=
	    X &= a;
	    System.out.println("X using &= : " + X);
	    
	    
	    
	 // assign value using ^=
	    X ^= a;
	    System.out.println("X using ^= : " + X);
	    
	    
	    
	    
	 // assign value using >>=
	    X >>= a;
	    System.out.println("X using >>= : " + X);
	    
	    
	    
	    
	 // assign value using <<=
	    X <<= a;
	    System.out.println("X using <<= : " + X);
	    
	    
	    //  Java Left Shift Operator Example
	    
	    System.out.println(10<<2);     //10*2^2=10*4=40  
		System.out.println(10<<3);     //10*2^3=10*8=80  
		System.out.println(20<<2);     //20*2^2=20*4=80  
		System.out.println(15<<4);     //15*2^4=15*16=240  
		
		
		
		//Java Right Shift Operator Example
	    //For positive number, >> and >>> works same 
	    //For negative number, >>> changes parity bit (MSB) to 0 
		
		System.out.println(10>>2);//10/2^2=10/4=2  
		System.out.println(20>>2);//20/2^2=20/4=5  
		System.out.println(20>>3);//20/2^3=20/8=2  
		
		 
		// Java Shift Operator Example: >> vs >>>
		
		//For positive number, >> and >>> works same  
	    System.out.println(20>>2);  //5
	    System.out.println(20>>>2);  //5
	    //For negative number, >>> changes parity bit (MSB) to 0  
	    System.out.println(-20>>2);  //-5
	    System.out.println(-20>>>2);  //  1073741819
	    
	  
	    
	 
	  }
	
	
	
	
	

}
