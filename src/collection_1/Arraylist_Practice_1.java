package collection_1;

import java.util.ArrayList;
import java.util.List;

public class Arraylist_Practice_1 {
	public static void main(String[] args) {

		final List<String> al = new ArrayList<>();
		al.add("India");
		al.add("Japan");
		System.out.println(al);
		al.add("China");
		System.out.println(al);

		al.add("Dubai");
		al.set(1, "Usa");
		System.out.println(al);
	}
}
