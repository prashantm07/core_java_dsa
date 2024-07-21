package practice;

import java.util.Arrays; 
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DuplicateElementInList {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10,10,20,20,30,40,40,50,50);
		
		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> duplicate = new LinkedHashSet<Integer>();
		for(Integer element : list) {
			if(!set.add(element)) {
				duplicate.add(element);
			}
		}
		System.out.println(duplicate);
		
		Map<Integer, Integer> elementCount = new HashMap<Integer, Integer>();
		for (int element : list) {
			if (elementCount.containsKey(element)) {
				elementCount.put(element, elementCount.get(element) + 1);
			} else {
				elementCount.put(element, 1);
			}
		}
		System.out.println(elementCount);
	}
	

}
