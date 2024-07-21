package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimaryNumber {

	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3, 4,7, 8, 13, 18, 21, 29, 34, 37, 40);
		List<Integer> primeNumber = new ArrayList<Integer>();
		for (int n = 0; n <= 100; n++) {
			if(isPrime(n)) {
				System.out.print(n+" ");
			}
		}
		System.out.println();
		for (int num : list) {
			if (isPrime(num)) {
				primeNumber.add(num);
			}
		}
		System.out.println(primeNumber);

	}
}
