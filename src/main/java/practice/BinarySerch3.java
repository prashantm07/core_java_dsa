package practice;

import java.util.Arrays;

public class BinarySerch3 {

	public int binary_serch1(int a[], int l, int r, int x) {
		while (l <= r) {
			int mid = (l + r) / 2;
			
			if (a[mid] == x) {
				return mid;
			}
			else if (a[mid] > x) {
				r = mid -1;
			} else {
				l = mid + 1;
			}
		}
		return -1;

	}

	public static void main(String[] args) {
		int a[] = { 12, 4, 52, 4, 2, 3, 4 };
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int right = a.length - 1;
		int left = 0;
		int target = 52;

		BinarySerch3 bs = new BinarySerch3();
		int res = bs.binary_serch1(a, left, right, target);
		if (res == -1) {
			System.out.println("Not Found");
		} else {
			System.out.println(target + " at index " + res);
		}

	}

}
