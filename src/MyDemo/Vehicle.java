package MyDemo;

public class Vehicle {

	int noOfWheels;

	String engineName;

	public Vehicle() {

		// Statement

	}

	public Vehicle(int noOfWheels, String engineName) {
		this.noOfWheels = noOfWheels;

		this.engineName = engineName;

	}

	public static void main(String[] args) {

		Vehicle ref = new Vehicle(4, "honda");

		System.out.println(ref.engineName);
		System.out.println(ref.noOfWheels);

	}

}
