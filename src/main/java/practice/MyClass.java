package practice;

import java.util.stream.IntStream;

public class MyClass {

	public static void main(String[] args) {
		int number = 27;
		System.out.println("Is " + number + " a prime number? - " + isPrime(number));
	}

	private static boolean isPrime(int number) {
		if (number <= 1) {
			return false;
		}
		return IntStream.rangeClosed(2, (int) Math.sqrt(number)).allMatch(n -> number % n != 0);
	}

}
