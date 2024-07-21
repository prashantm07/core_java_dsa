package practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountString {
	public static void main(String[] args) {
		String s = "prashant";

		char[] inputArray = s.toCharArray();

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (char c : inputArray) {

			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);

			} else
				map.put(c, 1);
		}
		System.out.println(map);
		
		Set<Character> set = new HashSet<Character>();
		Set<Character> duplicate = new HashSet<Character>();
		for(char c : inputArray) {
			if(!set.add(c)) {
				duplicate.add(c);
			}
		}
		System.out.println("Duplicate char in spring : "+duplicate);

	}

}
