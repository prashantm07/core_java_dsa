package java8;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		Optional<String> nonEmptyOptional = Optional.of("prashant");
		Optional<String> emptyOptional = Optional.empty();
		Optional<String> nullableOptional = Optional.ofNullable(null);
		System.out.println(nonEmptyOptional.get());
//		System.out.println(emptyOptional.get());
		System.out.println(nullableOptional);
		

	}

}
