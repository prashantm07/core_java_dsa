package collection;

import java.util.TreeMap;

public class Tree_map_collection {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();

		tm.put(10, "prashant");
		tm.put(2, "ram");
		tm.put(3, "kiran");
		tm.put(4, "pratik");
		tm.put(5, "kishor");
		tm.put(6, "abhi");
//		tm.put(null, "abhi");
//		tm.put(null, "abhi");
		System.out.println(tm.pollFirstEntry());
		System.out.println(tm.pollLastEntry());
		System.out.println(tm.tailMap(0));

//		for(Map.Entry<Integer, String> entry : tm.entrySet()) {
//			System.out.println(entry.getKey()+" "+entry.getValue());
//		}

//		tm.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

	}

}