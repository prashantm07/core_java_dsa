package array;

//selection sorting 
public class Sorting {
	public static void main(String[] args) {
		int[] arr = { 50, 12, 10, 45, 78, 65 };
		for (int i = 0; i < arr.length; i++) {

			int index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[index]) {

					index = j;


				}
			}
			int smallNo = arr[index];
			arr[index] = arr[i];
			arr[i] = smallNo;

		}
		for (int i : arr) {

			System.out.println(i);
		}
	}

}
