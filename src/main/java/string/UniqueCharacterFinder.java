package string;

import java.util.List; 
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UniqueCharacterFinder {
	public static void main(String[] args) {
		String input = "abcdabkjgh";
		List<Character> result = input.chars()
				.mapToObj(c ->(char) c) // Convert the string to an IntStream of characters
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))// Group by character and count occurrences
				.entrySet().stream()// Convert the map to a stream
				.filter(en -> en.getValue() == 1)  // Filter entries with a count of 1
				.map(Map.Entry::getKey)  // Map to the characters
				.collect(Collectors.toList());// Collect the result as a list
		System.out.println(result);

	}

}
