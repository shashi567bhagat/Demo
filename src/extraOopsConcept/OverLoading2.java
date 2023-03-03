package extraOopsConcept;

//However, if you want to execute the superclass method we can do so easily by using the super keyword.

//An example is shown below:

        class DataFlair
    {
        	
        	
        	int a=5;
	    public static  void coursename()
	    {
		System.out.println("We teach a variety of courses at DataFlair!");
	    }
	    
	    
	   public void display()
	    {
	    	System.out.println("iam parent class");
	    }
	    
    }

        class Java extends DataFlair
   {
        	
        	int a=6;
	    public static void coursename() 
	    {
	    //super.	coursename();
		
		System.out.println("Java is one of the most important courses taught at DataFlair.");
	    }
	    
//	    
//	    public void display()
//	    {
//	    	System.out.println("iam child class");    //in this condition only coursename method will run in parent child relation of object
//	                                                 // in parent child relation of object which method in parent should be also in child class
//	    }
	    public void display2()
	    {
	    	System.out.println("hi");
	    }
	    
   }
        



        public class OverLoading2 
   {

	 public static void main(String[] args)
	    {
		 Java obj = new Java();
		//DataFlair course = new Java();//in the parent child relation of object whatever parent have the method 
		                               //all method should have with in the class of child,  otherwise only that method will run which method will present in both parent as well as child
		obj. coursename();
		 obj.display();
		System.out.println(obj.a);
		 
		 
		}	
   }
