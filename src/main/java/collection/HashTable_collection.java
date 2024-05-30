package collection;

import java.util.Comparator;
import java.util.Hashtable;
import java.util.Map;

public class HashTable_collection {

	public static void main(String[] args) {
		Map<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(1, "prashant");
		ht.put(2, "ram");
		ht.put(3, "kiran");
		ht.put(4, "pratik");
		ht.put(5, "kishor");
		ht.put(6, "abhi");
		ht.put(7, "abhi");
//		ht.put(8, null); // hash table does not aloow null key or value
		
//		ht.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
//		for(Map.Entry<Integer, String> entry : ht.entrySet()) {
//			System.out.println(entry.getKey()+" "+entry.getValue());
//		}
		System.out.println(ht);
		
		
	}

}
