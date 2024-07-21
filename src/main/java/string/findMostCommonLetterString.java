package string;

import java.util.HashMap;
import java.util.LinkedHashMap; 
import java.util.Map;
import java.util.TreeMap;

public class findMostCommonLetterString {
	public static void main(String[] args) {
//		String string = "abcdccbdha";
		String string = "abcdccbdha";
		System.out.println("Most common letter in '" + string + "' is " + findMostCommonLetter(string));
	}

	private static char findMostCommonLetter(String string) {
		char ch[] = string.toCharArray();
		Map<Character, Integer> map = new TreeMap<Character, Integer>();
		for (char c : ch) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		System.out.println(map);
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
