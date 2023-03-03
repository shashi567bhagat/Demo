package string;

public class Index_of1 {
	
	
  public static void main(String[] args) {
	
		                          // 1112
		    String str1 = "Java is fun java";
		                 //012345678910 131415
		    
		    String s1="java technologies tech  java";
		   
		    System.out.println(str1.indexOf("a")); //indexof(int ch)
		    
		    System.out.println(str1.indexOf('a', 2));//indexof(int ch,int fromindex)
		    
		    System.out.println(str1.indexOf("fun"));// indexof(String str)
		    
		    System.out.println(s1.indexOf("tech",7));//indexof(String str,int fromindex)
		    
		    System.out.println(s1.indexOf("java",4));//indexof(String str,int fromindex)
		    
		    
		  }
}
