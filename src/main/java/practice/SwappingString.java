package practice;

import java.util.HashSet;
import java.util.Set;

public class SwappingString {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 2, 4, 3, 5, 6, 6, 7 };

		Set<Integer> uniEle = new HashSet<Integer>();
		Set<Integer> duplicateEle = new HashSet<Integer>();

//		for (int num : a) {
//			if (!uniEle.add(num)) {
//				duplicateEle.add(num);
//			}
//		}
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i] == a[j]) {
					a[j] = 0;
				}
				
			}
		}
		for(int num : a) {
			System.out.print(num+" ");
		}
		System.out.println(duplicateEle);
	}

}
