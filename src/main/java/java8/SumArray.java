package java8;

import java.util.Arrays;

public class SumArray {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };

		int sum = Arrays.stream(a).reduce(0, (a1, b) -> a1 + b);
		System.out.println(sum);
		
	}
}
