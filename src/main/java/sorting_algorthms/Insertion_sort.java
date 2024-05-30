package sorting_algorthms;

public class Insertion_sort {
	public static void main(String[] args) {
		int a[] = { 1, 5, 8, 3, 4, 2, 5 };
		for (int i = 0; i < a.length; i++) {
			int key = a[i];
			int j = i - 1;

			while (j >= 0 && a[j] > key) {
				a[j + 1] = a[j];
				j -= 1;
			}
			a[j + 1] = key;
		}
		for (int num : a) {
			System.out.print(num + " ");
		}
	}
}
