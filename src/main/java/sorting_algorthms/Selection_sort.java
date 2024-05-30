package sorting_algorthms;

public class Selection_sort {
	private  void main(String[] args) {
		int arr[] = { 1, 25, 4, 3, 5, 9, 2, 20 };
		for (int i = 0; i < arr.length; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

}
