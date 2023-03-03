package operators;

public class UnaryOperator5 {

	
	
	
	public static void main(String[] args) {
		int a=10;
		int b=10;
		
		System.out.println(a++  +  ++a); //     p=10 <---before-----"a++"--after------>11
		                  //p(10)+q(12)
		                  //22                     // q=12---before----------++a----after--->12
		
		System.out.println(b++  +  b++);     //                 x=10<-------b++--->b=11
		                //x(10)+y(11)                     //   y=11<--------------b++---->12
		               //21
	}

	}
	
	

