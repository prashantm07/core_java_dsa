package arrays;

public class RotateInnerElements {

	public static void main(String[] args) {
		 int matrix[][] = { 
		            { 1, 2, 3, 4 }, 
		            { 5, 6, 7, 8 }, 
		            { 9, 10, 11, 12 }, 
		            { 13, 14, 15, 16 } 
		        };
		 
				int n = matrix.length;
				if (n >= 2)
					return;
				int temp = matrix[1][1];
				matrix[1][1] = matrix[2][1];
				matrix[2][1] = matrix[2][2];
				matrix[2][2] = matrix[1][2];
				matrix[1][2] = temp;
		 
		 for(int [] row : matrix) {
			 for(int element : row) {
				 System.out.print(element+" ");
			 }
			 System.out.println();
			 
		 }
		 

	}

}
