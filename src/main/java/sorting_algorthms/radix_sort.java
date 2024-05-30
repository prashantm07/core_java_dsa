package sorting_algorthms;

import java.util.Arrays;

public class radix_sort {

	public static void main(String[] args) {
		int[] arr = { 29, 83, 471, 36, 91, 8 };
		int n = arr.length;
		radixSort(arr);
		print(arr, n);
	}

	private static void print(int[] arr, int n) {
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}

	public static void radixSort(int arr[]) {

		int max = Arrays.stream(arr).max().getAsInt();
		for (int exp = 1; max / exp > 0; exp *= 10) {
			countSort(arr, exp);
		}
	}

	private static void countSort(int[] arr, int exp) {
		int n = arr.length;
		int[] output = new int[n];
		int[] count = new int[10];

		Arrays.fill(count, 0);

		for (int i = 0; i < n; i++) {
			count[(arr[i] / exp) % 10]++;
		}

		for (int i = 1; i < 10; i++) {
			count[i] = count[i] + count[i - 1];
		}

		for (int i = n - 1; i >= 0; i--) {
			output[count[(arr[i] / exp) % 10] - 1] = arr[i];
			count[(arr[i] / exp) % 10]--;
		}

		for (int i = 0; i < n; i++) {
			arr[i] = output[i];
		}
	}

}