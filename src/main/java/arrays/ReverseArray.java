package arrays;

public class ReverseArray {
	public static void main(String[] args) {
		int a [] = {1,2,3,4,5};
		int reverse [] = new int[a.length];
		
		for (int i = 0; i < a.length; i++) {
			reverse[i] = a[a.length-i-1];
			
		}
		
		for (int i = 0; i < reverse.length; i++) {
			System.out.print(reverse[i]+" ");
		}
	}
}
