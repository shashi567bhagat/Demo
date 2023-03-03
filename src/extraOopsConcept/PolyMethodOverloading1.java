package extraOopsConcept;

public class PolyMethodOverloading1 {

	
	public int add(int a, int b)
	{
		return a+b;
	}	
	
	public int add(int a,int b, int c)
	{
	return a+b+c;
	}
	
	public double add(int a,int b, double c ,double d)
	{
		return a+b+c+d;
	}
	public static double add(int a,double b)
	{
		return a+b;
	}
	
	
	public static void main(String[] args) {
		
		PolyMethodOverloading1 sc =new PolyMethodOverloading1();
		
		System.out.println(sc.add(12, 120));
		System.out.println(add(12,12.23));
		System.out.println(sc.add(12 ,25, 23.560, 12.450));
	}
	
}
