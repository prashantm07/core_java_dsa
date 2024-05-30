package arrays;

public class LeaderNumber {

	public static void main(String[] args) {

		int a[] = { 1, 2, 4, 9, 14, 8, 6, 3 };

		int max = a.length - 1;
		System.out.println("leader  number is : ");
		System.out.println(a[a.length - 1]);

		for (int i = a.length - 2; i >= 0; i--) {
			if (a[i] > max) {
				System.out.println(a[i]);

				max = a[i];
			}
		}

	}

}
