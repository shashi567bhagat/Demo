package MyDemo;



/*
 * without static class
 * Addition of two no
 * subtraction of two no
 * multiplication of two no
 * division of two no 
 * */

public class Addition1 {
	
	
	public static void main(String[] args) {
		
		Addition1 ref=new Addition1();
		ref.AdditionOfTwoNumber();
		ref.SubtractionOfTwoNumber();
		ref.MulOfTwoNumber();
		ref.DivOfTwoNumber();
		
	}

	
	
	void AdditionOfTwoNumber() {
		
		int number1=3;
		int number2=8;
		
		System.out.println(number1+number2);
		
	}
	
      	void SubtractionOfTwoNumber() {
      		
      		int number1=3;
    		int number2=8;
    		
    		System.out.println(number1-number2);
			
      	}
			
      	
          void MulOfTwoNumber() {
      		
      		int number1=3;
    		int number2=8;
    		
    		System.out.println(number1*number2);
			
      	}


           void DivOfTwoNumber() {
		
		  int number1=3;
	     int number2=8;
	
	System.out.println(number1/number2);
	
	}

			
		
		
		
	}

