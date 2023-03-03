package interfaceJava;



//example of multiple inheritance

 interface father
 {  
	void draw(int a);

	



	
 }  


 interface  mother 
 {  
	 void draw(int a); 
 }  

 
 
 class child implements father ,mother 
 {
	 @Override
		public void draw(int a) 
	   {
			int sum=10;
			sum=sum+a;
			System.out.println(sum);
			
		}
 }
 
       public class InterfaceClass2 
    {
	    public static void main(String[] args)
	  {  
		// TODO Auto-generated method stub  
	child m = new child();  
      m.draw(10);
		 
	
	}

		
	



	
}
