package arrays;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter 3 digit number");
		int num = sc.nextInt();

		int number = num;
		int temp, total = 0;
		for (; number != 0; number /= 10) {
			temp = number % 10;
			total = total + temp * temp * temp;
		}
		if(num == total) {
			System.out.println("Number Is Armstrong Number : "+num);
		}
		else {
			System.out.println("Number Is Not Armstrong Number ");
		}
	}

}
