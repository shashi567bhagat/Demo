package string_Builder_class;

 final class Employee{
	
	final String PanCardNumber;

	public Employee(String panCardNumber) {
		
		PanCardNumber = panCardNumber;
	}

	/**
	 * @return the panCardNumber
	 */
	public String getPanCardNumber() {
		return PanCardNumber;
	}
	
	
}
 
public  class Immutable_class {

	public static void main(String[] args) {
		
		Employee e=new Employee("BZVPBF00899");
		
		String s=e.PanCardNumber;
		
		System.out.println(s);
	}
	
	
}
