package exception_handling2;

import java.io.File;
import java.io.IOException;

public class File_Exception7 {

	
	public static void main(String[] args) throws IOException {
		
		//file ko rename karne ka tarika
		 
		  File  f= new File("C:\\Users\\Pankaj\\Desktop\\LC.txt"); 
		  File  f1= new File("C:\\Users\\Pankaj\\Desktop\\shashi.txt"); 
		  
	         if(f.exists())
	         {
	        	 
	         System.out.println(f.renameTo(f1));
	         }
	         else
	         {
	        	 System.out.println("file doesnot Exist");
	         }
	         }
	}

