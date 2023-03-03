package instance_and_static;

//Java Program to demonstrate the use of static variable  
class Student 

{
	
	  int rollno;// instance variable
	  String name;
	  static String college = "ITS";// static variable
	 
	 
	 
	// constructor
	 public Student(int rollno, String name) {
			super();
			this.rollno = rollno;
			this.name = name;
		}

	 
	 
	// method to display the values
	void display() {
		System.out.println(rollno + " " + name + " " + college);
	}
	
    static  void show(  String a)
    {
    	
    	System.out.println(a);
    	
    }

}



public class StaticMethod1 {
	public static void main(String args[]) {
		
	Student s1 = new Student(111, "Karan");
		
	Student s2 = new Student(222, "Aryan");
                                            //we can change the college of all objects by the single line of code  
                                               //Student.college="BBDIT";  
		s1.display();
		s2.display();
		Student.show("shashi");
		Student.show("bhagat");
	}
}
