package string;

public class Spilt_Method2 {

	
		public static void main(String args[])
		{
			String s1 = "java  string split method by javatpoint";
			
			String[] words = s1.split(" ");// splits the string based on whitespace
			
			// using java foreach loop to print elements of string array
			//for (String w : words)
				
			for(int i=0;i<words.length;i++)	
			{
				//System.out.println(w);
				
				System.out.println(words[i]);
			}
		}
	}


