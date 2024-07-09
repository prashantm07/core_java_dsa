package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class MaxMinNumber {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(30, 5, 6, 3, 7, 3, 8, 1);

		int max = list.stream().max(Comparator.naturalOrder()).get();
		System.out.println("Max number : " + max);

		int min = list.stream().min(Comparator.naturalOrder()).get();
		System.out.println("min number : " + min);

		int sum = list.stream().mapToInt(Integer::intValue).sum();
		System.out.println("sum is :" + sum);

		 list.stream().filter(i -> i% 2 == 0).forEach(System.out::println);
		 
		 Optional<Integer> find = list.stream().findFirst();
		 System.out.println(find);

//		int max = list.stream().max(Comparator.naturalOrder()).get();
	}

}
