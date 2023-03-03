package package1;

import java.util.Date;

public final class Immutable_1 {

	
	final private String  StudentName;
	
	final private int RollNo;
	final Date dob;
	
	public Immutable_1(String StudentName,int RollNo, Date dob)
	{
		this.StudentName=StudentName;
		this.RollNo=RollNo;
		this.dob=new Date(dob.getTime());
		
	}
	
	public String getStuudentName()
	{
		return StudentName;
	}
	
	
	public int getRollNo()
	{
		return RollNo;
	}
	
	
	public Date getdob()
	{
		return new Date(dob.getTime());
	}
	
	
	public String Tostring()
	{
		return " [StudentName=" + StudentName + ",RollNo= "+ RollNo + " , dob= " +dob +"]";
		
		
		
	}
	
	public static void main(String[] args) {
		
		
		Immutable_1 obj=new Immutable_1("shashi",123, new Date());
		
		System.out.println(obj.StudentName);
		
		System.out.println(obj.RollNo);
		
		System.out.println(obj.dob);
		
		System.out.println(obj.Tostring());
		
		obj.getdob().setHours(12);
		
		System.out.println(obj.Tostring());
		obj.Tostring();
	}
	
	
}
