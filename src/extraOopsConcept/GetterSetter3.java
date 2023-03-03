package extraOopsConcept;

import java.util.Scanner;

// user input in getter and setter method

class Tests {

	private String name;

	private int id;

	Scanner userinput = new Scanner(System.in);

	public void setName() {
		System.out.println("Enter a name : ");

		name = userinput.next();
	}

	public String getName() {

		return name;
	}

	public void setId() {
		System.out.println("Enter Id :");
		int number = userinput.nextInt();

		if (number > 10) {
			System.out.println("valid input");
		} else {
			System.out.println("invalid input");

			System.out.println("Enter the digit above  from 10");
		}

		id = number;

	}

	public int getId() {
		return id;
	}

	public void displayInfo() {
		setName();
		System.out.println("You entered " + " " + getName());

		setId();
		// System.out.println("you entered" + " "+ getId() );
	}

}

public class GetterSetter3 {

	public static void main(String[] args) {

		Tests test = new Tests();
		test.displayInfo();
	}
}
