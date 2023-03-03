package exception_handling2;

import java.util.Scanner;

public class Using_Throw_Key {

	// function to check if person is eligible to vote or not
	public static void printGrades(int marks) {

		try {
			if (marks > 100) {
				// since total marks cannot exceed 100, we are throwing an exception
				// to show user that he has done a mistake while entering data
				throw new ArithmeticException("Total Marks cannot be more than 100");
				
				

				// throw new ArithmeticException("Total Marks cannot be more than 100"); not
				// used multiple throw keyword
				
				
			} else if (marks >= 60) {
				System.out.println("Grade A");
				
			} 
			else if (marks > 33 && marks < 60) {
				System.out.println("Grade B");
			} 
			else {
				System.out.println("Grade C");
			}
			
		}
		catch (ArithmeticException e) {
			System.out.println(e);
		}
	}

	// main method
	public static void main(String args[]) throws Exception {
		// asking the user to enter total marks
		System.out.print("Enter total marks: ");
		Scanner scan = new Scanner(System.in);
		int totalMarks = scan.nextInt();

		// calling the method to print grades
		
		printGrades(totalMarks);
	}
}
