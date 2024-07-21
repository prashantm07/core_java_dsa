package practice;

import java.util.Arrays;

public class BinarySerch2 {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 54, 45, 20 };
		Arrays.sort(a);
		int key = 2;
		int res = Arrays.binarySearch(a, key);
		System.out.println(res);
		if (res > 0) {
			System.out.println(key + " found  at index : " + res);
		} else {
			System.out.println(key + " Not found in the array");
		}

	}

}
