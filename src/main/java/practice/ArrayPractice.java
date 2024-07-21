package practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ArrayPractice {

	public static void main(String[] args) {
//		Unique elemet in array
		System.out.println("Unique elemet in array");
		int a[] = { 1, 2, 3, 4, 5, 4, 2, 3 };
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
				}
			}
			if (count == 1) {
				System.out.print(a[i] + " ");
			}

		}

		System.out.println();
		int a1[] = { 1, 0, -5, 0, 3, 0, -8, 9 };
		Set<Integer> set = new HashSet<Integer>();
		for (int ele : a1) {
			if (ele != 0)
				set.add(ele);
		}
		System.out.println("Unique element in array  : " + set);
		for (int i = 0; i < a1.length; i++) {
			for (int j = i + 1; j < a1.length; j++) {
				if (a1[i] == 0) {
					int temp = a1[i];
					a1[i] = a1[j];
					a1[j] = temp;
				}

			}

		}
		for (int ele : a1) {
			System.out.print(ele + " ");
		}
		System.out.println();
//		sorting array
		int a2[] = { 9, 8, 7, 5, 6, 1, 2, 3 };
		for (int i = 0; i < a2.length; i++) {
			for (int j = 0; j < a2.length; j++) {
				if (a2[i] < a2[j]) {
					int temp = a2[i];
					a2[i] = a2[j];
					a2[j] = temp;
				}

			}
		}
		System.out.println("sorting Array a2 : ");
		for (int ele : a2) {
			System.out.print(ele + " ");
		}

//		pair of given input
		System.out.println("\npair of given array");
		int a3[] = { 9, 8, 7, 5, 6, 1, 2, 3 };
		int inputValue = 9;
		for (int i = 0; i < a3.length; i++) {
			for (int j = i + 1; j < a3.length; j++) {
				int sum = a3[i] + a3[j];
				if (sum == inputValue) {
					System.out.println(a3[i] + " " + a3[j]);
				}

			}
		}

//		Count of each element in array 
		System.out.println("Count each element in array");
		int aa[] = { 9, 8, 7, 5, 6, 1, 2, 3, 5, 6, 1, 2, 3 };
		Map<Integer, Integer> countArray = new HashMap<Integer, Integer>();

		for (int ele : aa) {
			if (countArray.containsKey(ele)) {
				countArray.put(ele, countArray.get(ele) + 1);
			} else {
				countArray.put(ele, 1);
			}
		}
		for (Map.Entry<Integer, Integer> entry : countArray.entrySet()) {
			System.out.println(entry.getKey() + " :" + entry.getValue());

		}
//		second max element in array
		int arr[] = { 45, 3, 2, 1, 4, 5, 6, 7, 8, 9 };
		int fLarge, sLarge;
		if (arr[0] > arr[1]) {
			fLarge = arr[0];
			sLarge = arr[1];
		} else {
			fLarge = arr[1];
			sLarge = arr[0];
		}
		for (int i = 2; i < arr.length; i++) {
			if (arr[i] > fLarge) {
				fLarge = a[i];
				sLarge = fLarge;
			} else if (arr[i] < fLarge && arr[i] > sLarge) {
				sLarge = arr[i];

			}
		}
		System.out.println("second Large Element : " + sLarge);
		
//		leader Element 
		int a4[] = { 16, 2, 4, 9, 14, 8, 6, 3 };
		int max = a4[a4.length - 1];
		System.out.println("Leader element is ");
		System.out.println( );
		for (int i = a4.length - 2; i >= 0; i--) {
			if (a4[i] > max) {
				max = a4[i];
				System.out.print(a4[i] + " ");
			}
		}
	}

}

//3
//6
//8
//14
//16