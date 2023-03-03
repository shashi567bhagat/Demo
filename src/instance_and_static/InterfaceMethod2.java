package instance_and_static;

class Employee
{
	
 static int empId;
 static  String empName;


public Employee(int empId, String empName) {
	super();
	this.empId = empId;
	this.empName = empName;

}


@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + "]";
}
    static void  add(int a,int b,int c,int sum)
    {
       sum=sum+a+b+c;
    	System.out.println(sum);
    	
    }





}


public class InterfaceMethod2 {

	
	
	
	public static void main(String[] args) {
		Employee r1=new Employee(10, "shashi");
		Employee r21=new Employee(15, "Bhagat");
		
		Employee.add(10, 20, 30, 40);
		Employee.add(20, 30, 40, 50);
		//System.out.println(r21.add(20,30, 10, 60));
		
		System.out.println(r1);
		System.out.println(r21);	
		
	}
}
