package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseString {
	public static void main(String[] args) {
		List<String> listString = Arrays.asList("java", "spring", "hibernate");

		List<String> upperCaseString = listString.stream()
				.map(s -> s.substring(0, 1).toUpperCase() + s.substring(1) + s.substring(s.length() - 1).toUpperCase())
				.collect(Collectors.toList());
		System.out.println(upperCaseString.get(0));
	}
}
