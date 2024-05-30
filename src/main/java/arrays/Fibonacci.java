package arrays;

public class Fibonacci {

	static int i = 10;
	public static void main(String[] args) {
		int n = 10;
		int first = 0;
		int secound = 1;
		System.out.println(i);
		for (int i = 2; i <= n; i++) {
			
			System.out.print(first + " ");
			
			int nextTerm = first + secound;
			first = secound;
			secound = nextTerm;
		}
	}

}
