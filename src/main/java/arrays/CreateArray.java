package arrays;

public class CreateArray {
	public static void main(String[] args) {

		int a[] = new int[5];
		String s[] = new String[5];
		s[0] = "prashant";
		
		a[0] = 10;
		int number = 0;
		for (int i = 0; i < s.length; i++) {
//			a[i] = ++number;
			System.out.println(s[i]);
		}
		System.out.println();
	}

}
