package arrays;

public class FindSecondLargeNumber2 {

	public static void main(String[] args) {
		int arr[] = { 45, 3, 2, 1, 4, 5, 6, 7, 8, 9 };

		int fLarge, sLarge;

		if (arr[0] > arr[1]) {
			fLarge = arr[0];
			sLarge = arr[1];
		} else {
			sLarge = arr[0];
			fLarge = arr[1];
		}

		for (int i = 2; i < arr.length; i++) {
			if (arr[i] > fLarge) {
				sLarge = fLarge;
				fLarge = arr[i];
			} else if (arr[i] < fLarge && arr[i] > sLarge) {
				sLarge = arr[i];

			}

		}
		System.out.println("Second Large numkber in the array : "+sLarge);

	}

}
