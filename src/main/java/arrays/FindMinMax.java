package arrays;

public class FindMinMax {

	public static void main(String[] args) {
		int a[] = { 3, 2, 1, 56, 10000, 167};
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}
			}

		}
			System.out.println("Min element : "+a[0]);
			System.out.print("Max element : "+a[a.length-1]);
	}

}
