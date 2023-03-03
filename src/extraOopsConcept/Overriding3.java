package extraOopsConcept;

// Java program to show that
//if the static method is redefined by
//a derived class, then it is not
//overriding, it is hiding

class Pa {
	// Static method in base class
	// which will be hidden in subclass
	static void m1() {
		System.out.println("From parent " + "static m1()");
	}

	// Non-static method which will
	// be overridden in derived class
	void m2() {
		System.out.println("From parent " + "non-static(instance) m2()");
	}
}

class Ch extends Pa {
	// This method hides m1() in Parent
     
	static void m1() {
		System.out.println("From child static m1()");
	}

	// This method overrides m2() in Parent
	@Override
	 void m2() {
		System.out.println("From child " + "non-static(instance) m2()");
	}
}

public class Overriding3 {

	public static void main(String[] args)
	 {
		Pa obj1 = new Ch();
	     obj1.m1();

	     
	     obj1.m2();
	
	 }

}
