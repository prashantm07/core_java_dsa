package arrays;

public class ReverseArray {
	public static void main(String[] args) {
		int a [] = {1,2,3,4,5};

		/*******************Using new array **********************/
		int reverse [] = new int[a.length];
		
		for (int i = 0; i < a.length; i++) {
			reverse[i] = a[a.length-i-1];
			
		}
		
		for (int i = 0; i < reverse.length; i++) {
			System.out.print(reverse[i]+" ");
		}
		
		
/******************* using reverse array **********************/	
//		int start = 0;
//		int end = a.length-1;
//		while(start < end) {
//			int temp = a[start];
//			a[start] = a[end];
//			a[end] = temp;
//			start++;
//			end--;
//		}
//		for(int i =0; i< a.length;i++) {
//			System.out.print(a[i]+" ");
//		}
	}
}
