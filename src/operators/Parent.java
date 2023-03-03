package operators;

/*     The java instanceof operator is used to test whether the object is an instance of the specified type (class or subclass or interface).

      The instanceof in java is also known as type comparison operator because it compares the instance with type. 
It returns either true or false. 
If we apply the instanceof operator with any variable that has null value, it returns false.
 * 
 * 
 * 
 * 
 * */
public class Parent {

	// Java program to demonstrate working of instanceof Keyword

	// Class 1
	// Parent class

	// Class 2
	// Child class
	class Child extends Parent {

		public static void main(String[] args) {

			// Creating object of child class
			Parent cobj = new Parent();

			// A simple case
			if (cobj instanceof Child)
				System.out.println("cobj is instance of Child");
			else
				System.out.println("cobj is NOT instance of Child");

			// instanceof returning true for Parent class also
			if (cobj instanceof Parent)
				System.out.println("cobj is instance of Parent");
			else
				System.out.println("cobj is NOT instance of Parent");

			// instanceof returns true for all ancestors

			// Note : Object is ancestor of all classes in Java
			if (cobj instanceof Object)
				System.out.println("cobj is instance of Object");
			else
				System.out.println("cobj is NOT instance of Object");
		}
	}

}

//
//	//class Parent {  }
//	class Child extends Parent { 
//	 
//
//	
//	    public static void main(String[] args)
//	    {
//	    	Parent pobj = new Parent();
//	        if (pobj instanceof Child)
//	           System.out.println("pobj is instance of Child");
//	        else
//	           System.out.println("pobj is NOT instance of Child");
//	  
//	}
//}
//}