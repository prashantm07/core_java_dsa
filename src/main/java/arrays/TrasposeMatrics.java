package arrays;

public class TrasposeMatrics {

	public static void main(String[] args) {
//		int a[][] = { { 1, 1, 1, 1 }, { 2, 2, 2, 2 }, { 3, 3, 3, 3 }, { 4, 4, 4, 4 } };
		int a[][] = { { 1, 2, 3, 4 }, 
				      { 5, 6, 7, 8 }, 
				      { 9, 10, 11, 12 } };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				int temp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = temp;

			}

		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

	}

}
