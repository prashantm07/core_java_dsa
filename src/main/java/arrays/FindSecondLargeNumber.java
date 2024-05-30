package arrays;

public class FindSecondLargeNumber {

	public static void main(String[] args) {
		int arr[] = {45, 3, 2, 1, 4, 5, 6, 7, 8, 9};

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				
				if (arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" "+arr[i]);
		}
		System.out.println();
		System.out.println("Second largest :  "+arr[arr.length - 2]);
		System.out.println("largest Number :  "+arr[arr.length - 1]);

//		int fLarge, sLarge;
//
//		if (arr[0] > arr[1]) {
//			fLarge = arr[0];
//			sLarge = arr[1];
//		} else {
//			sLarge = arr[0];
//			fLarge = arr[1];
//		}
//		
//		for (int i = 2; i < arr.length; i++) {
//			if(arr[i] > fLarge) {
//				sLarge = fLarge;
//				fLarge = arr[i];
//			}
//			else if (arr[i] < fLarge && arr[i] > sLarge) {
//				sLarge = arr[i];
//				
//			}
//			
//		}
//		System.out.println(sLarge);

	}

}
