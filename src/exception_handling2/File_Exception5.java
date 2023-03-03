package exception_handling2;

import java.io.*;

public class File_Exception5 {

	//1st method file ko read karne ka
	public static void main(String[] args) throws Exception {
		FileReader fr=new FileReader("D:\\pankaj.txt");
		
		int i = 0;
		while((i=fr.read())!=-1)
		{
			System.out.print((char)i);
			
		}
	}
}
