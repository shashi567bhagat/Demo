package exception_handling2;

import java.io.*;
public class File_Exception4 {

	
	public static void main(String[] args) throws Exception {     
		
		
	    FileWriter writer = new FileWriter("D:\\pankaj.txt");  

	    BufferedWriter buffer = new BufferedWriter(writer);  
	    buffer.write("Welcome to javaTpoint.");  
	    buffer.close();  
	    System.out.println("Success");  
	    }  
	}

