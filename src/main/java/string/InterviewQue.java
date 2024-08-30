package string;

import java.util.HashSet;
import java.util.Set;

public class InterviewQue {

	public static void main(String[] args) {
		
		int[] array = { 1, 2, 3, 2, 4, 3, 5, 6, 6, 7 };

//		Set<Integer> ele = new HashSet<Integer>();

		Set<Integer> uniqueEle = new HashSet<Integer>();
		Set<Integer> duplicateElement = new HashSet<Integer>();

		for (int i = 0; i < array.length; i++) {
			if (!uniqueEle.add(array[i])) {
				duplicateElement.add(array[i]);
			}
		}
		System.out.println("Duplicate element : " + duplicateElement);
		System.out.println("Unique element : " + uniqueEle);
		
		
		for (int i = 0; i < array.length; i++) {
//			if (array[i] != 0) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					array[j] = 0;
				}

			}
		}
//			if(!ele.add(array[i])) {
//				array[i] = 0;
//			}
//		}
		for (int num : array)
			System.out.print(num + " ");

	}

}
