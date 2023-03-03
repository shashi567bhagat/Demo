package operators;

public class BitwiseOperator {
	/*    Java Logical Operators
	 * 
          Logical operators are used to check whether an expression is true or false. They are used in decision making.

         Operator	           Example	                             Meaning
         
         &&  (Logical AND)	  expression1 && expression2	         true only if both expression1 and expression2 are true
         ||  (Logical OR)	  expression1 || expression2	         true if either expression1 or expression2 is true
          !  (Logical NOT)	  !expression	                         true if expression is false and vice versa
	 * 
	 * 
	 * */
	
	
	
	public static void main(String[] args) {
		
		//logical AND  (true only if both expression1 and expression2 are true)
		int a=5;
		int b=3;
		
		   if(a>b && a>b) {
			   System.out.println(true);
		   }
		   else
			   System.out.println(false);
		    
		   int c=6;
		   int d=8;
		   
		   if(c>d && c>d)  {
			   System.out.println(true);
		   }
		   else
			   System.out.println(false);
		   
		   
		   // ||  (Logical OR), true if either expression1 or expression2 is true
		   
		   int e=5;
		   int f=4;
		   
		   if(e>f || e>f) {
			   System.out.println(true);
		   }
		   else
			   System.out.println(false);
		   
		   
		   
		   if(5>3 || 15>12) {
			   System.out.println(true);
		   }
		   else
			   System.out.println(false);
		   
		   //!  (Logical NOT),true if expression is false and vice versa
		   
		   System.out.println(3 & 7);
		   
		   
		   // AND gate perform kr rha hai
		   /*  011
		    *+ 111
		    * ------ ----
		    *  011           in AND Gate 1,1--->1
		    *                            1,0--->0
		    *   
		    *   so 011 is 3               
		    * 
		*/
		   
		   System.out.println(5|6); //  OR GATE Perform karega
		   
		   /*
		    *    5----> 101
		    *    6----> 110
		    *         ---------
		    *           111------>7
		    * 
		    * 
		    * 
		    * */
		   
		   
		   if(1>2 && 10>10/0) {
			   
			   System.out.println(true);
			   
		   }
		   else
			   System.out.println(false);
		   
		
		   
		   
		   
	}
	

}
