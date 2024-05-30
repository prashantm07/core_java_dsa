package arrays;

public class SwapNumbers {
	public static void main(String[] args) {

		int a = 20;
		int b = 10;
// swapping number without using third veriable
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("a : "+a + "\n" +"b : "+ b);
	}
}
