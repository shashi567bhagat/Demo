package extraOopsConcept;


class Overload{
	
	
	 int display(int a,int b)
	{
		int sum =a+b;
		System.out.println("sum of two number ----------->" +sum);
		return sum;
	}
	
	double display(int a,double d, double c)
	{
		double sum= (a+d+c);
		System.out.println("sum of three number---------->" + sum);
		return sum;
		
		
	}
	
}



public class OverLoading {

	public static void main(String[] args) {
		Overload obj =new Overload();
		obj.display(5, 10);
		obj.display(10, 10.4, 20.9);
		
		
	}
	
	
}
