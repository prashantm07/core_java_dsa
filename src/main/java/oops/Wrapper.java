package oops;

public class Wrapper {

	public static void main(String[] args) {
		String number = "123456";
		System.out.println(number);
		int num = Integer.parseInt(number);
		System.out.println(num);
		int sum = 0;
		while (num > 0) {
			int lastdigit = num % 10;
			sum = sum + lastdigit;
			num = num / 10;

		}
		System.err.println("print error");
		System.out.println(sum);
	}

}
