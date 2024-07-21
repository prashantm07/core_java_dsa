package arrays;

import java.util.Arrays;

public class BinarySerch {

	public int binary_Serch(int[] a, int l, int r, int x) {
		while (l <= r) {
			int mid = (l+r) / 2;

			if (a[mid] == x) {
				return mid;
			} 
			else if(a[mid] > x) {
				r = mid -1;
			}
			else {
				l = mid +1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
//		int arr[] = { 5, 6, 4, 7, 8, 2, 3, 4, 1 };
		int arr[] = { 12, 4, 52, 4, 2, 3, 4 };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int right = arr.length - 1;
		int left = 0;
		int target = 52;
		
		BinarySerch bs = new BinarySerch();
		int result = bs.binary_Serch(arr, left,right, target);
		if(result == -1) {
			System.out.println(" element present not present ");
		}
		else {
			System.out.println("element present at index "+ result);
		}
		
//		inbuid method
//		Arrays.sort(arr);
//		int res = Arrays.binarySearch(arr, target);
//		System.out.println(target+" at index "+res);
		

	}

}
