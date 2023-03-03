package collection_4_Map;

import java.util.HashMap;

public class Hashmap_6 {

	public static void main(String[] args) {

		HashMap<Character, Integer> hm = new HashMap<>();

		String s = "abc";

		for (int i = 0; i < s.length(); i++) {

			if (hm.containsKey(s.charAt(i))) {
				System.out.println("dublicate found");
				return;
			} else {
				hm.put(s.charAt(i), 1);

			}

		}

		System.out.println(hm);
	}
}
