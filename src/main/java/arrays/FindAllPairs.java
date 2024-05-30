package arrays;

import java.util.Scanner;

public class FindAllPairs {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 4, 8, 9, 0 };

		Scanner sc = new Scanner(System.in);
		System.out.println("please enter number : ");
		int inputValue = sc.nextInt();
		int sum = 0;
		boolean pairFound = false;
		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				 sum = arr[i] + arr[j];
				if (sum == inputValue) {
					System.out.println(arr[i] + " + " + arr[j] + " = " + inputValue);
					pairFound = true;
				}
				
			}
		}
		if (!pairFound) {

			System.out.println("Sum of " + inputValue + " this number not found");
		}
		sc.close();
	}
}
