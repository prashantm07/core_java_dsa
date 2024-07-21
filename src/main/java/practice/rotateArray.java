package practice;

public class rotateArray {
	public static void reverseArray(int[][] a) {
		// traspose matrics
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				int temp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = temp;
			}
		}
//	reverse each row Rotate Right
		for (int i = 0; i < a.length; i++) {
			int left = 0;
			int right = a.length - 1;
			while (left < right) {
				int temp = a[i][left];
				a[i][left++] = a[i][right];
				a[i][right--] = temp;

			}
		}
	
////		Rotatte Left
//		for (int i = 0; i < a.length; i++) {
//			int left = 0;
//			int right = a.length - 1;
//			while (left < right) {
//				int temp = a[left][i];
//				a[left++][i] = a[right][i];
//				a[right--][i] = temp;
//
//			}
//		}

		print(a);
	}

	public static void print(int[][] a) {
		for (int[] row : a) {
			for (int element : row) {
				System.out.print(element + " ");

			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3 }, 
				      { 4, 5, 6 }, 
				      { 7, 8, 9 } };
		rotateArray ry = new rotateArray();
		ry.reverseArray(a);

	}

}
