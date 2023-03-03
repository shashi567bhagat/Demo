package exception_handling2;

import java.io.*;
import java.io.FileReader;

public class File_Exception6{
	
   public static void main(String[] args) throws Exception {
	   
	        FileReader fr=new FileReader("D:\\pankaj.txt");
			BufferedReader br=new BufferedReader(fr);
			
			int i = 0;
			while((i=br.read())!=-1)
			{
				System.out.print((char)i);
				
			}
			
			br.close();
			fr.close();
		}
}	
