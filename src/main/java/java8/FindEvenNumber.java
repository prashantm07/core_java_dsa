package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindEvenNumber {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 5, 0, 3, 4, 63, 7, 2, 6, 8);
		List<?> l10 = Arrays.asList(10, "String", 1);
		list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList()).forEach(System.out::println);

	}

}
