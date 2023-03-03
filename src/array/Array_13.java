package array;

public class Array_13 {

	
	public static void main(String[] args) {
		
		String s="this is my first program";
		
		String[] str=s.split(" ");
		
		System.out.println("length of array is  --->" + str.length);
		
		for(int i=0;i<str.length;i++)
		{
			
			System.out.println(str[i]);
			
		}
		
String s1="THE PEOPLE OF INDIA, having solemnly resolved to constitute India into a SOVEREIGN, SOCIALIST, SECULAR DEMOCRATIC REPUBLIC and to secure to all its citizens";
		
		String[] s2=s1.split(" ");
		
		for(int i=0;i<s2.length;i++)
		{
			System.out.println( "index of "+ i + " " + s2[i]);
		}
	}
}
