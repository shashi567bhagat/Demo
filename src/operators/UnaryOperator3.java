package operators;

public class UnaryOperator3 {

	
	
	
	
	public static void main(String[] args) {

		int a=10;// a=10
		
		
		int b=a++;
		    b++;       // because of postfix "a" first assign the value of "a" to "b" after that
		               // "a" increase by 1 by itself so  b=10  ,  a=11
		               // here b=10 so that after ++b  the value of b=11
		
		int c=++a;    // because of prefix "a" first increase by 1 to itself after that "a" assign the value 
		    ++c;      //to "c"  so that a=12,c=12
		              // here c=12, so after ++c the value of c=13
		int d=10;
		
		int e=d++; 
		    e++;         // because of postfix here d=10 so it assign the value of 10 to the "e" after assigning
                    // d increase by 1 to itself	
		            // so d=11,e=10
		            // after e++ ,e=11
		    
		int f=d++;
		    f++;        //f=11, d=12
		                // after f++ ,f=12
		
		System.out.println(b++ + ++c);
		                //x(11)+ p(14)              //b=11,c=13       
		                //25                            //x=11<-----before---------b++- after-->b=12, 
		                                            //p=14 <--------before------++c----- after->c=14
		
		
		
		System.out.println(e++ + f++); //e=11,f=12            y=11<-----before---------e++-- after---e->12
		                  //y(11)+z(12)                                   // z=12 ---before---------f++--------after f=13
		                  //23
		//a++ its means that "a" give the value to the other(like b,c...etc) afer that it increase by 1 to itself
		//++a its means that "a" increase by 1 to itself after that it give the value of "a" to the other
		
	}
	
	
}
