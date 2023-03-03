package string_Builder_class;



public final class Immutable2  {

 final private String StudentName;
 final private int RollNumber;

	public Immutable2(String StudentName, int RollNumber) {
		this.StudentName = StudentName;
		this.RollNumber = RollNumber;
	}

	public String GetStudentName()
	{
		return StudentName;
	}

//	
	public int GetRollNumber()

	{
		return RollNumber;
	}


	public static void main(String[] args)
	
	{
		Immutable2 obj=new Immutable2("john",12345);
		
		System.out.println("Name is " +   obj.GetStudentName());
		
		System.out.println("Roll no is "   + obj.GetRollNumber());
		
	}

}
