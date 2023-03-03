package exception_handling2;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File_Exception1 {

	
		  public static void main(String[] args) throws IOException {
			
			  
			  File  f= new File("C:\\Users\\Pankaj\\Desktop\\LC.txt"); 
		         if(f.createNewFile())
		         {
		        	 
		         System.out.println("file successful created......");
		         }
		         else
		         {
		        	 System.out.println("file already exist..");
		         }
		         }
		}
        
        
        
        

