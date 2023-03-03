package string_Builder_class;

import java.util.Date;

public final class Immutable_5 {

	private String StudentName;
	final private	int RollNubber;
	final private	Date dob;
		
		private Immutable_5(String StudentName,int RollNubber,	Date dob)
		{
			this.StudentName=StudentName;
			this.RollNubber=RollNubber;
			//this.dob=dob;  this.dob=dob;  ye line agar use krte hai to set hour wala line kaam krta hai agar ho date ko change karne me success ho jata hai eska matlab immutable ka jo theroy hai wo
			// break ho gya esliye sethours hone ke bawjud date waghr cahnge na ho niche wala line likhte hai
			this.dob = (dob == null) ? null : new Date(dob.getTime());
			
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
			return (dob == null) ? null : new Date(dob.getTime());
		}
		
		
		
		
		@Override
		public String toString() {
			return "[StudentName=" + StudentName + ", RollNubber=" + RollNubber + ", dob=" + dob + "]";
		}


		public static void main(String[] args) {
		
			
			Immutable_5 obj=new Immutable_5("shashi",12345, new Date());
			
			System.out.println(obj.getdob());
			
		    System.out.println(obj.toString());
			
		      obj.getdob().setDate(16);   
		      
		      obj.getdob().setHours(10);
		      
		      obj.getdob().setMinutes(34);
		      
		      obj.getdob().setSeconds(23);
		      System.out.println(obj.getdob());
			
	        System.out.println(obj.toString());
	
		}
}
