package array;


class Student1
{
    
    public String name;
    Student1(String name)
    {
        this.name = name;
    }
    
//      @Override
//    public String toString()
//      
//      {
//        return name;
//      }
//    
}
   

public class Array_class3 {

	 public static void main (String[] args)
	    {
	        Student1[] myStudents = new Student1[] {new Student1("Dharma"),new Student1("sanvi"),new Student1("Rupa"),new Student1("Ajay"),new Student1("Radha")};
	   
//	        myStudents[0]=new Student1("Dharma");
//	        
//	        myStudents[1]=new Student1("sanvi");
//	        
//	        myStudents[2]=new Student1("Rupa");
//	        
//	        myStudents[3]=new Student1("Ajay");
//	        
//	        myStudents[4]=new Student1("Radha");
	        
	        
	        // accessing the elements of the specified array
	        
	      
	        
	        for(int i=0;i<myStudents.length;i++)
	        {
	        	System.out.println(myStudents[i].name);
	        }
	        
	       // myStudents[i].name or 
	       // myStudent[i] likh bus aur upar to string wala metgod lga le 
	   }
}
 

