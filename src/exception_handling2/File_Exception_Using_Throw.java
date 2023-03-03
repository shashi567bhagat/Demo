package exception_handling2;

import java.io.*;

class FileException {
	// method to read a file
	public static void readMyFile() throws FileNotFoundException {

		FileReader file = new FileReader("C:\\Users\\Pankaj\\Desktop\\pankaj.txt");
		BufferedReader text = new BufferedReader(file);
		// System.out.println(text);

		// if file doesn't exist throw a checked exception
		if (text == null) {
			
			throw new FileNotFoundException();
		}

		else {

			System.out.println("file Exist");
		}
	}

}

public class File_Exception_Using_Throw extends  FileException{

	public static void main(String args[]) {
		try {
			readMyFile();
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found: " + e);
		}
	}

}
