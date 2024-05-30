package sorting_algorthms;

public class bubble_sort {
	public void bubble(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}

	void printArray(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		int arr[] = { 45, 3, 2, 1, 4, 5, 6, 7, 8, 9 };
		int n = arr.length;
		bubble_sort bs = new bubble_sort();
		bs.bubble(arr, n);
		System.out.println("sorted array : ");
		bs.printArray(arr, n);

	}

}
