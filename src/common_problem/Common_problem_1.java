package common_problem;

public class Common_problem_1 {

	int Emp_id;
	String Emp_Name;
	String Emp_Company;

	public Common_problem_1(int emp_id, String emp_Name, String emp_Company) {

		Emp_id = emp_id;
		Emp_Name = emp_Name;
		Emp_Company = emp_Company;

	}

	@Override
	public String toString() {
		return " [Emp_id=" + Emp_id + ", Emp_Name=" + Emp_Name + ", Emp_Company=" + Emp_Company + "]";
	}

	public static void main(String[] args) {

		Common_problem_1 obj = new Common_problem_1(123, "shashi", "hcl");

		Common_problem_1 obj1 = new Common_problem_1(124, "jyotsna", "tcs");

		Common_problem_1 obj2 = new Common_problem_1(125, "neha", "infosys");

		Common_problem_1 obj3 = new Common_problem_1(126, "tamanna", "tech mahindra");

		System.out.println(obj.toString());
		
		System.out.println(obj1.toString());
		
		System.out.println(obj2.toString());
		
		System.out.println(obj3.toString());

	}

}
