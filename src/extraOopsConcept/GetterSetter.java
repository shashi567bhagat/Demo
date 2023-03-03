package extraOopsConcept;

class GetSet {

	private String name;

	// Method -1 Getter
	public String getName() {
		return name;

	}

	// Method 2 Setter

	public Void setName(String N) {
		name = N;
		return null;

	}
}

public class GetterSetter {

	public static void main(String[] args) {

		GetSet gs = new GetSet();
		gs.setName("ISRO");
		System.out.println(gs.getName());

	}

}
