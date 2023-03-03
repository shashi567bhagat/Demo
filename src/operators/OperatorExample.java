package operators;

public class OperatorExample {

	
	public static void main(String[] args) {
	
		int x=10;
//	
		int a=x++; //  a=10,x=11
			
		System.out.println(" The Value Of a is  ----->  " + a  + "     " +  " The Value of X is  ----->  "+  x);
		
		int b=++x;  //b=12,x=1
		
		System.out.println(" The Value Of b is  ----->  " + b  + "     " +  " The Value of X is  ----->  "+  x);
		
		int c=x--; //c=12,x=11
		
		System.out.println(" The Value Of c is  ----->  " + c  + "     " +  " The Value of X is  ----->  "+  x);
		
		int d=--x; //d=10,x=10
		
		System.out.println(" The Value Of d is  ----->  " + d  + "     " +  " The Value of X is  ----->  "+  x);
		
	}
	
	
}
