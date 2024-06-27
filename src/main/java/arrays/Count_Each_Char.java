package arrays;

import java.util.HashMap;

public class Count_Each_Char {
	public static void main(String[] args) {
		String s = "aassddff";
		char ch[] = s.toCharArray();
		HashMap<Character, Integer> count = new HashMap<>();

		for (char c : ch) {
			if (count.containsKey(c)) {
				count.put(c, count.get(c) + 1);
			} else {
				count.put(c, 1);
			}

		}

		System.out.println(count);

	}

}
