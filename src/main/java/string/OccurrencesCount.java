package string;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurrencesCount {
	public static void main(String[] args) {

		String s = "prashant";

		char[] charArray = s.toCharArray();

		Map<Character, Integer> charCount = new HashMap<Character, Integer>();
			for (char ch : charArray) {
			if (charCount.containsKey(ch)) {
				charCount.put(ch, charCount.get(ch) + 1);
				System.out.println(charCount.get(ch));
			} else {
				charCount.put(ch, 1);
			}
		}

		System.out.println(charCount.toString());

//		Using java 8
//		Map<Character, Long> charCountMap = s.chars().mapToObj(c -> (char) c)
//				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//		System.out.println("java 8");
//		System.out.println(charCountMap);

	}
}
