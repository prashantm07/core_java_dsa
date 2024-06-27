package arrays;

public class ArrayMethod {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int temp[] = a.clone();
	
		for (int i = 0; i < temp.length; i++) {
			System.out.print(i+" ");
		}
		System.out.println(temp.toString());
	}

}
