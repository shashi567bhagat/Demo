package exception_handling2;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class File_Exception {

	
	public static void main(String[] args) throws IOException {
		
		
		File f=new File("C:\\Users\\Pankaj\\Desktop\\LC.txt");
		FileWriter f1=new FileWriter(f);
		try {
			if(f.exists())
			{
				
				System.out.println(f.getName());
			
				
				System.out.println(f.getAbsolutePath());
				
				System.out.println(f.canRead());
				
				System.out.println(f.canWrite());
				
				
				
			   f1.write("java is the best programming Language");
				
				//System.out.println(f.delete());
			}
			else
			{
				System.out.println("file doesnot exits");
			}
		}catch(Exception e)
		
		{
			System.out.println("exception handle");
		}
		
	}
	
}
