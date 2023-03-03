package exception_handling2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File_Exception2 {
//maine text file ko create kiya fir usme kuch likha
	public static void main(String[] args) {
		try {
			File f=new File("c:\\Users\\pankaj\\Desktop\\pankaj1.txt");
			FileWriter f1=new FileWriter(f);
//			
//			try {
//				
//				f1.write("welcome");
//			}
//				
//			finally
//			{
//		      	f1.close();				
//			}
				
			f1.write("welcome India 1");
			f1.close();
			
			System.out.println("successfully data wrote");
			
		} catch (Exception e) {
			
			System.out.println("hi");
			
		}
	}
	
	
}
