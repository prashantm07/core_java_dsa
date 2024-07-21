package practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class Myclass2 {
	public static void main(String[] args) {
		String string = "abcdccbdhaa";
		System.out.println("Most common letter in '" + string + "' is " + findMostCommonLetter(string));
	}

	private static char findMostCommonLetter(String string) {
		char ch[] = string.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();

		for (char c : ch) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		char mostCommonLetter = ' ';
		int count = 0;
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > count) {
				mostCommonLetter = entry.getKey();
				count = entry.getValue();
			}
		}
		return mostCommonLetter;
	}
}
