package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class Find_second_largest_number {
public static void main(String[] args) {
	
	int a [] = {45, 12, 56, 15, 24, 75, 31, 89};
	
	Optional<Integer> secondMax = Arrays.stream(a).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst();
	 if (secondMax.isPresent()) {
         System.out.println("The second largest element is: " + secondMax.get());
     } else {
         System.out.println("The array does not have a second largest element.");
     }
}
	
}
