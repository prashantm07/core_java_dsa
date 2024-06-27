package arrays;

public class SumOfDigits {
//	Using if else
	int sum = 0;

//	public int sumOfAllDigits(int number) {
//		if (number == 0) {
//			return sum;
//		} else {
//			int lastDigit = number % 10;
//			sum += lastDigit;
//			number = number / 10;
//			sumOfAllDigits(number);
//		}
//		return sum;
//	}

	public static void main(String[] args) {

		int number = 123456;
		int sum = 0;
		while (number > 0) {
			int lastDigit = number % 10;
			sum = sum + lastDigit;
			number = number / 10;
		}
		System.out.println(sum);

		SumOfDigits sumd = new SumOfDigits();
//		int sum = sumd.sumOfAllDigits(number);
//		System.out.println("sum : "+sum);

//		
	}
}
