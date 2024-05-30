package arrays;

public class RotateMatrics90 {

	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3 }, 
				      { 4, 5, 6 }, 
				      { 7, 8, 9 } };
		
		int N = a.length;
//		traspose matrics 
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				int temp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = temp;
			}
		}
//		Reverse each row in trasnpose marics 
//		for (int i = 0; i < N; i++) {
//			for (int j = 0; j < N / 2; j++) {
//				
//				int temp = a[j][i];
//				a[j][i] = a[N - 1 - j][i];
//				a[N - 1 - j][i] = temp;
//			}
//		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N / 2; j++) {
				
				int temp = a[i][j];
				a[i][j] = a[i][N - 1 -j];
				a[i][N - 1 -j] = temp;
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}

//1 4 7 
//2 5 8 
//3 6 9 

//7 1 4 
//8 2 5
//9 6 3
