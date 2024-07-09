package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Max3Min3 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

		System.out.println("min 3 element");
		list.stream().sorted(Comparator.naturalOrder()).limit(3).distinct().forEach(System.out::println);
		System.out.println("max 3 element");
		list.stream().sorted(Comparator.reverseOrder()).limit(3).distinct().forEach(System.out::println);
	}
}
