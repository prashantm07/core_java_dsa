package arrays;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class FindMostCommonLetterArray {
	public static void main(String[] args) {
//	int arr [] = {7,8,8,7,7,4,9,0,9,0};
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		System.out.println(
				"Most common number in this  '" + Arrays.toString(arr) + "' is :  " + findMostCommonNumber(arr));
	}

	private static int findMostCommonNumber(int[] a) {
//	char ch[] = string.toCharArray();
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		System.out.println(map);
		for (int ele : a) {
			if (map.containsKey(ele)) {
				map.put(ele, map.get(ele) + 1);
			} else {
				map.put(ele, 1);
			}
		}
		int mostCommonNumber = ' ';
		int count = 0;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > count) {
				mostCommonNumber = entry.getKey();
				count = entry.getValue();
			}
		}
		return mostCommonNumber;
	}
}
