package arrays;

public class AddNumber {
	public static void main(String[] args) {
//		int number = 8472;
		
		String number1 = "1234";
		int no = Integer.parseInt(number1);
		int sum = 0;
		while (no > 0) {
			sum += no % 10;
			no = no / 10;

//			if (no == 0 && sum > 9) {
//				no = sum;
//				sum = 0;
//			}
		}
		System.out.println(sum);
	}
}
