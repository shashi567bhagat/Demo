package collection_2;

import java.util.HashSet;
import java.util.Objects;

public class Hashset_4 {

	public static void main(String[] args) {
		
		HashSet<Employee> hs=new HashSet<>();
		 
		Employee e=new Employee(10,"shashi");
		
		Employee e1= new Employee(11,"pankaj"); 
		
		 
		Employee e3=new Employee(12,"kant");
		
		Employee e4= new Employee(11,"pankaj"); 
		
		hs.add(e);
		
		hs.add(e1);
		hs.add(e3);
		hs.add(e4);
		
		System.out.println("size " + hs.size() + " ");
		
		System.out.println(hs);
		
		
	
		
	}
}


class Employee
{
	int roll_No;
	String Name;
	
	public Employee(int roll_No,String Name)
	{
		this.roll_No=roll_No;
		this.Name=Name;
		
	}

	@Override
	public String toString() {
		return "Employee [roll_No=" + roll_No + ", Name=" + Name + "]";
	}

	@Override
	public int hashCode() {
		
		System.out.println(Objects.hash(Name, roll_No));
		return Objects.hash(Name, roll_No);
	}

	@Override
	public boolean equals(Object obj) {
		
		System.out.println("equals");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(Name, other.Name) && roll_No == other.roll_No;
	}

	
	
	

}