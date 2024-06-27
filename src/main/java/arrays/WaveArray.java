package arrays;

import java.util.Arrays;

public class WaveArray {

	public static void main(String[] args) {
		int a[] = { 2, 4, 7, 8, -9, 10 };

		int n = a.length;
		for (int i = 0; i < a.length; i += 2) {
			if (i > 0 && a[i - 1] > a[i]) {
//			calling swapping
				Swaping(a, i, i - 1);

			}
			if (i < n - 1 && a[i] < a[i + 1]) {
//			calling swapping 
				Swaping(a, i, i + 1);
			}
		}
		System.out.println(Arrays.toString(a));
	}

	public static void Swaping(int a[], int i, int j) {
//		Swapping logic
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
