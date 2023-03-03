package extraOopsConcept;


class mno
{
	

	 void display()
    {
    	
    	System.out.println("hello");
    }
    
  void add()
    {
	
	    
    	int a=10;
    	int b=10;
    	int sum=a+b;
    	System.out.println(sum);
    }
  void showroom()
  
  {
	   
	   System.out.println("my car");
  }
  
  void vehicle()
  {
	  System.out.println("classic 350");
	  
  }
  

}


class rst extends mno
{
	  @Override
	
	void display()
	    {
		
		    
	    	System.out.println("hello pankaj");
	    }
	
	  
	   @Override
           void add()
	    {
		 
		  
	    	int a=15;
	    	int b=10;
	    	int sum=a+b;
	    	System.out.println(sum);
	    }
           
           
          
}



public class Override4  {

	
	
	
	public static void main(String[] args) {
		
		mno mn=new rst();   //mno  rst class name
		mn.add();
		mn.display();
		mn.showroom();
		mn.vehicle();
		
		
	}
}
