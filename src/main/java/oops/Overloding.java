package oops;

public class Overloding {

	public static void main(String[] args) {

		System.out.println(addition.add(10, 10));
	}

}

class addition {
	public static int add(int a, int b) {
		return a + b;
	}
	public static long add(int a, long b) {
		return a + b;
	}
}
