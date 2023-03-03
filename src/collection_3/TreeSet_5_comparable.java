package collection_3;

import java.util.TreeSet;

class Employee implements Comparable<Employee> {

	int empId;
	String name;

	public Employee(int empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}

	String getName() {
		return this.name;
	}

	void setName(String name) {
		this.name = name;
	}

	void setempId(int a) {
		this.empId = a;
	}

	int getempId() {
		return this.empId;
	}

	@Override
	public int compareTo(Employee o) {
		if (empId > o.empId) {
			return 1;
		} else if (empId < o.empId) {

			return -1;
		} else

			return 0;
	}

}

public class TreeSet_5_comparable {

	// main method
	public static void main(String[] argvs) {
		// creating objects of the class Employee
		Employee obj1 = new Employee(1, "satyam");

		Employee obj3 = new Employee(5, "Neha");

		Employee obj2 = new Employee(2, "shashi");

		Employee obj4 = new Employee(8, "ram");

		Employee obj5 = new Employee(6, "shyam");

		obj4.setempId(10);
		TreeSet<Employee> ts = new TreeSet<Employee>();

		// adding the employee objects to
		// the TreeSet class
		ts.add(obj1);
		ts.add(obj2);
		ts.add(obj3);
		ts.add(obj4);
		ts.add(obj5);

		for (Employee o : ts) {
			System.out.println(o.empId + " " + o.name + " ");
		}

		System.out.println("The program has been executed successfully.");

	}

}
