package string_Builder_class;

import java.util.Date;

public final class  Immutable_4 {

	private String StudentName;
	final private	int RollNubber;
	final private	Date dob;
		
		private Immutable_4(String StudentName,int RollNubber,	Date dob)
		{
			this.StudentName=StudentName;
			this.RollNubber=RollNubber;
			this.dob=dob;
			//this.dob= new Date(dob.getTime());// eske use karne se time change nai hoga
			
		}
		
		
		public String getStudentName()
		{
			return StudentName;
		}
		
		public int getRollNubber()
		{
			return RollNubber;
			
		}
		
		public Date getdob()
		{
			//return this.dob;
			//return birthDate;
		  return new Date(dob.getTime());
		}
		
		
		
		
		@Override
		public String toString() {
			return "[StudentName=" + StudentName + ", RollNubber=" + RollNubber + ", dob=" + dob + "]";
		}


		public static void main(String[] args) {
		
			
			Immutable_4 obj=new Immutable_4("shashi",12345, new Date());
			
			
			System.out.println(obj.getStudentName());
			
			System.out.println(obj.getRollNubber());
			
		     System.out.println(obj.getdob());
			
			obj.getdob().setDate(18);
			
			obj.getdob().setHours(5);
			
	        System.out.println(obj.toString());
	        
	        System.out.println(obj.getdob());
			
	  
			

		}
	
	
}
