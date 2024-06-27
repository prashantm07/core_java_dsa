package arrays;

public class LeaderNumber {

	public static void main(String[] args) {

		int a[] = { 16, 2, 4, 9, 14, 8, 6, 3 };

		int max = a[a.length-1];
		System.out.println("Leader number is : ");
		System.out.println(a[a.length-1]);
		 for(int i = a.length-2; i>=0; i--) {
			 if(a[i] > max) {
				 max = a[i];
				 System.out.println(a[i]);
			 }
		 }
		
	}

}
