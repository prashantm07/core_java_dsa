package arrays;

public class AddNumber {
	public static void main(String[] args) {
		int number = 5124;

		int sum = 0;
		while (number > 0) {
			sum += number % 10;
			number = number / 10;

			if (number == 0 && sum > 9) {
				number = sum;
				sum = 0;
			}
		}
		System.out.println(sum);
	}
}
