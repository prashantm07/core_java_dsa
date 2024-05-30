package collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap_collection {
	public static void main(String[] args) {
		Map<Integer, String> lhm = new LinkedHashMap<Integer, String>();
		lhm.put(10, "prashant");
		lhm.put(2, "ram");
		lhm.put(3, "kiran");
		lhm.put(4, "pratik");
		lhm.put(5, "kishor");
		lhm.put(6, "abhi");
		lhm.put(6, "abhi");
//		lhm.put(null, "abhi");

//		lhm.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
//
		for(Map.Entry<Integer, String> entry : lhm.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}
}
	