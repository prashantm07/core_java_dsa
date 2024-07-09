public class sumPairsArray {
	public static void main(String[] args) {
		int a[] = { 4, 5, 7, 11, 9, 13, 8, 12 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
//				sum = a[i] + a[j];
				if (a[i] + a[j] == 20) {
					System.out.println(a[i] + " " + a[j]);
				}
			}

		}

	}
}
