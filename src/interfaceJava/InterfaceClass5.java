package interfaceJava;







//example of multiple inheritance by using interface

interface father1
{  
	default void print(int a)
	{
		System.out.println("iam father");
		System.out.println(a);
	}	
}  


interface  mother1 
{  
	// void drwa(int  a); 
	 
	static void show(int a)
	{
		System.out.println("iam mother");
		System.out.println(a);
	}
	 
}  



class child1 implements father1 ,mother1 
{

	@Override
	public void print(int a) {
		// TODO Auto-generated method stub
		father1.super.print(a);
	}

	
	
	
}  


public class InterfaceClass5 
{	


	public static void main(String[] args)
	  {  
		
	    child1 sc=new child1();
	    sc.print(10);
	   // mother1 obj=new child1();
	    mother1.show(20); // obj bnakr call nai kr skte direct interface ka nam aur method ka naam
	    
	    	
	  }  	
}
