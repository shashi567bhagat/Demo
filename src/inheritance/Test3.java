package inheritance;


class Animall{
	
	void eat()
	{
		System.out.println("Eating......");
	}	
}


  class Dogg extends Animall{
	  
	  void bark()
	  {
		  System.out.println("Barking.....");
		  
	  }  
  }

class BabyDogg extends Dogg{
	
	void weep()
	{
		System.out.println("weeping.....");
	}	
}





public class Test3 {
	
	public static void main(String[] args) {
		 
		BabyDogg bd=new BabyDogg();
		bd.eat();
		bd.bark();
		bd.weep();
		
	}

}
