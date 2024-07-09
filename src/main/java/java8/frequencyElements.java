package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class frequencyElements {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book",
				"Pencil");
		Map<String, Long> countMap = list.stream()
				.collect(Collectors
						.groupingBy(Function.identity(), Collectors.counting()));
		
		Entry<String, Long>	mostFrequentElement = countMap.entrySet().stream().max(Map.Entry.comparingByValue()).get();
		System.out.println(countMap);
		System.out.println(mostFrequentElement.getKey()+" "+mostFrequentElement.getValue());
	}

}
