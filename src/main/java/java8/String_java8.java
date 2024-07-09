package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class String_java8 {
	public static void main(String[] args) {
		List<String> strings = new ArrayList<String>();
		strings.add("apple");
		strings.add("banana");
		strings.add("cherry");
		List<String> capitalLatter = strings.stream().map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
				.collect(Collectors.toList());
		System.out.println(capitalLatter);
	}
}
