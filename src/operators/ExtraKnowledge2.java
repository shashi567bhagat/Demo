package operators;

/*           Variables:-
 *           
 *           static--------->
 *           
 *           instance varible--------->
 *           
 * 
 * */



public class ExtraKnowledge2 {

	
	public static void main(String[] args) {
		
		xyz ref=new xyz("shashi","bhagat");	
		
	    System.out.println(ref.FirstName);	
	    
	    System.out.println(ref.LastName);	
	    
	    
	    System.out.println(xyz.clg);
	}
}


class xyz{
	
	
	static String clg="CCET";
	
	     String FirstName;
	     String LastName;
	     
		public xyz(String firstName, String lastName) {
		//	super();
			FirstName = firstName;
			LastName = lastName;
		}
	     
	
	
	
	
}