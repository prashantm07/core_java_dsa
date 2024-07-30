package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class FindMostCommonLetterArray {
	public static void main(String[] args) {
//	int arr [] = {7,8,8,7,7,4,9,0,9,0};
		int arr[] = { 1, 2, 3, 4, 5, 2, 6, 7, 8, 9, 9, 0};
		System.out.println(
				"Most common number in this  '" + Arrays.toString(arr) + "' is :  " + findMostCommonNumber(arr));

	}

	private static int findMostCommonNumber(int[] a) {
//	char ch[] = string.toCharArray(); 
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int ele : a) {
			if (map.containsKey(ele)) {
				map.put(ele, map.get(ele) + 1);
			} else {
				map.put(ele, 1);
			}
		}
		System.out.println(map);
		int mostCommonNumber = ' ';
		int count = 0;

//		for (Entry<Integer, Integer> e : map.entrySet()) {
//			if(e.getValue() > count) {
//				mostCommonNumber = e.getKey();
//				count = e.getValue();
//			}
//			
//		}

		for (Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > count) {
				mostCommonNumber = entry.getKey();
				count = entry.getValue();
			}
		}
		return mostCommonNumber;
	}
}
