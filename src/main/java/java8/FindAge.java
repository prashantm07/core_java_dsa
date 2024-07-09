package java8;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FindAge {
	public static void main(String[] args) {
		LocalDate DOB = LocalDate.of(1997, 11, 28);
		LocalDate today = LocalDate.now();
		
		long age = ChronoUnit.YEARS.between(DOB, today);
		System.out.println(age);
	}
}
