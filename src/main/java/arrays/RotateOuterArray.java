package arrays;

public class RotateOuterArray {

    public static void main(String[] args) {
        int matrix[][] = { 
            { 1, 2, 3, 4 }, 
            { 5, 6, 7, 8 }, 
            { 9, 10, 11, 12 }, 
            { 13, 14, 15, 16 } 
        };

        int N = matrix.length;

        // No need to rotate 1x1 matrix
        if (N <= 1) {
            return;
        }

        rotateOuterRing(matrix);

        // Print the rotated matrix
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void rotateOuterRing(int[][] matrix) {
        int N = matrix.length;

        // Save the top row except the last element
        int[] temp = new int[N - 1];
        for (int i = 0; i < N - 1; i++) {
            temp[i] = matrix[0][i];
        }

		// 1. Move the left column to the top row
		for (int i = 0; i < N - 1; i++) {
			matrix[0][i] = matrix[N - 1 - i][0];
		}

		// 2. Move the bottom row to the left column
		for (int i = 0; i < N - 1; i++) {
			matrix[N - 1 - i][0] = matrix[N - 1][N - 1 - i];
		}

		// 3. Move the right column to the bottom row
		for (int i = 0; i < N - 1; i++) {
			matrix[N - 1][N - 1 - i] = matrix[i][N - 1];
		}

		// Move the saved top row to the right column
		for (int i = 0; i < N - 1; i++) {
			matrix[i][N - 1] = temp[i];
		}
    }
}
