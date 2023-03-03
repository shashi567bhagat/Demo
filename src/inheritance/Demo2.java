package inheritance;

// single inheritance

class college {

	
	String Name="Christian college of Engineering & Tchnology" ;
	
	void show()
	{
		System.out.println(Name);
	}	
}

class shashi extends college {
	
	
	void display()
	{
	int	rollno=45;
	int marks=90;
	String Name="shashi";
	
	System.out.println("roll no----> "  +rollno +  "   " + " marks-----> " + marks + "   " + " Name----> " + Name);
	
		}
}


public class Demo2 {

	
	public static void main(String[] args)
	{
		
		shashi r=new shashi();
        r.show();
        r.display();
	}
	
	
	
}
