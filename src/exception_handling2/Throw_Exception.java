package exception_handling2;

import java.util.Scanner;

class AgeValidator extends RuntimeException {
	public AgeValidator(String message) {
		super(message);

	}

}

public class Throw_Exception {

	public static void main(String[] args) throws AgeValidator {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Age");
		int age = sc.nextInt();
try {
	    if (age>=18) {
		System.out.println("allowed");
		
		}

		else {

			throw new AgeValidator("not allowed");
		 }
}
	catch(AgeValidator e)
		{
			System.out.println(e);
		}

		

        System.out.println("welcome ");
	}

}
