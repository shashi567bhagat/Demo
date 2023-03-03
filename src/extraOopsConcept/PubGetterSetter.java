package extraOopsConcept;

import java.util.Scanner;

class xyz{
	
       private	int age;
	
     
       // method -1 setter
       public void setAge (int age)
      { 
    	   Scanner sc=new Scanner(System.in);
    	   
    	   
    	   System.out.println("Age should be 18 or above from 18 years of old");
    	   
    	   System.out.println("Enter age");
    	   
    	   age=sc.nextInt();
    	    
           if(age>=18)
         {
    	  System.out.println("person allowed in PUB");
         }
        else
    	  
        {
    	  
         System.out.println("prrson not allowed inside the PUB");
       
        }
	 
   
	    this.age=age;
	
    }
       
       
       
     //method 2 getter
       
       public int getAge()
       {
        return age;	
       }


}

public class PubGetterSetter {

	
	public static void main(String[] args) {
	 
		xyz input=new xyz();
		input.setAge(0);
		
		System.out.println("you entered " +input.getAge());
		
		
		
	}
}
