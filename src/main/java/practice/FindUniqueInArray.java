package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;



public class FindUniqueInArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 1, 2, 3, 5 };
//		Map<Integer, Integer> uniqEle = new HashMap<Integer, Integer>();
//		for(int ele : arr) {
//			if(uniqEle.containsKey(ele)) {
//				uniqEle.put(ele, uniqEle.get(ele) + 1);
//			}
//			else {
//				uniqEle.put(ele, 1);
//			}
//		}
//		for(Map.Entry<Integer, Integer> entry : uniqEle.entrySet() ) {
//			if(entry.getValue() == 1) {
//				System.out.println(entry.getKey()+" ");
//			}
//		}
//		for (int i = 0; i < arr.length; i++) {
//			int count = 0;
//			for (int j = 0; j < arr.length; j++) {
//				if (arr[i] == arr[j]) {
//					count++;
//				}
//			}
//			if (count == 1) {
//				System.out.println(arr[i]);
//			}
//
//		}
//// *****************Using Stream Api*****************************************/
		List<Integer> uniqEle = Arrays.stream(arr).distinct().boxed().collect(Collectors.toList());
		
		System.out.println(uniqEle);
		
		Optional<Integer> uniqueElement = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)  // Filter to find the element with a count of 1
                .map(Map.Entry::getKey)
                .findFirst();
		
		System.out.println(uniqueElement.get());
                

	}
}
