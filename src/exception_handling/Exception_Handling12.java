package exception_handling;

import java.io.*;

import java.io.PrintWriter; 

public class Exception_Handling12 

{

	public static void main(String[] args) {
		
		PrintWriter pw;
		
		   try 
		    
		   {  
            pw=new PrintWriter("jtp.text"); //may throw exception   
            
            pw.println("saved");
            
           }         
		    
		     
		    catch (FileNotFoundException e) 
		    {  
            
               System.out.println(e);  
            }      
		
           System.out.println("File saved successfully");  //
  }  
	
	
}
