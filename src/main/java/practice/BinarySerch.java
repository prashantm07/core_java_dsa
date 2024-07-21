package practice;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySerch {

	public int binary_Serch(int[] a, int l, int r, int x) {
		while (l <= r) {
			int mid = (l + r) / 2;

			if (a[mid] == x) {
				return mid;
			} 
			else if(a[mid] > x) {
				r = mid - 1;
			}
			else {
				l = mid +1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
//		int arr[] = { 12, 4, 52, 4, 2, 3, 4 };
		int arr[] = { 1, 2, 3, 4, 5, 6, 54, 45, 20 };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int right = arr.length - 1;
		int left = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter value : ");
		int target = sc.nextInt();
		
		BinarySerch bs = new BinarySerch();
		int result = bs.binary_Serch(arr, left,right, target);
		if(result == -1) {
			System.out.println(" element present not present ");
		}
		else {
			System.out.println("element present at index "+ result);
		}
		sc.close();

	}

}
