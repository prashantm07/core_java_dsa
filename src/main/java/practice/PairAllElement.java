package practice;

public class PairAllElement {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 5, 6, 7, 8, 9 };
		int inputValue = 10;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				int pairSum = a[i] + a[j];
				if (pairSum == inputValue) {
					System.out.println(a[i] + " " + a[j]);
				}

			}

		}

	}

}
