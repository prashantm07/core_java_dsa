package collection;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMap_collection {
	public static void main(String[] args) {
// HashMap
		Map<Integer, String> hm = new HashMap<>();
		Map<Character, Integer> hm1 = new HashMap<>();

		hm.put(6, "prashant");
		hm.put(2, "ram");
		hm.put(3, "kiran");
		hm.put(4, "pratik");
		hm.put(5, "kishor");
		hm.put(1, "abhi");
		hm.put(null, "abhi");
		hm.put(null, "a");

//		hm1.put('a', 1);
//		hm1.put('a', 2);
//		hm1.put('a', 3);

//		System.out.println(map);
//		hm.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.naturalOrder()))
//				.forEach(System.out::println);
		System.out.println(hm);
//		for (Map.Entry<Integer, String> entry : hm.entrySet()) {
//			System.out.println(entry.getKey() + " " + entry.getValue());
//
//		}
//		Linked Hash Map 

	}
}
