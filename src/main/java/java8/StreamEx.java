package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamEx {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 30, 70, 80, 30, 7, 10);

//		FindAny
		Optional<Integer> FindAny = list.stream().findAny();
		System.out.println("Find Any : " + FindAny.get());

//		Find First
		Optional<Integer> FindFirst = list.stream().findFirst();
		System.out.println("Find First : " + FindFirst.get());

//		Min Value
		Optional<Integer> min = list.stream().min((a, b) -> {
			return a.compareTo(b);
		});
		System.out.println("Min Value : " + min.get());

//		Max Value
		Optional<Integer> max = list.stream().max((a, b) -> {
			return a.compareTo(b);
		});
		System.out.println("Max Value : " + max.get());

//		Count Element
		long count = list.stream().count();
		System.out.println("Count Element : " + count);

//		Filter
		List<Integer> filter = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println("Filter Element : " + filter);
		
//      distinct Element
		List<Integer> distinctElement = list.stream().distinct().collect(Collectors.toList());
		System.out.println("distinct Element" + distinctElement);
		
//		Limit
		System.out.print("Limit : ");
		 list.stream().limit(2).forEach(ele ->{
			System.out.print(ele+" ");
		});

	}

}
