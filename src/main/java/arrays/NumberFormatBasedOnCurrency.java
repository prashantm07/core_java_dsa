package arrays;

import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;

public class NumberFormatBasedOnCurrency {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter amount : ");

		long amount = sc.nextInt();

		NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
		String usFormat = us.format(amount);

		NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		String franceFormat = france.format(amount);

		NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
		String chinaFormat = china.format(amount);

		NumberFormat india = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
		String indiaFormat = india.format(amount);

		NumberFormat uk = NumberFormat.getCurrencyInstance(Locale.UK);
		String ukFormat = uk.format(amount);

		System.out.println("US : " + usFormat);
		System.out.println("FRANCE : " + franceFormat);
		System.out.println("CHINA : " + chinaFormat);
		System.out.println("INDIA : " + indiaFormat);
		System.out.println("UK : " + ukFormat);
		sc.close();
	}
}
