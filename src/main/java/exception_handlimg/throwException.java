package exception_handlimg;

public class throwException {

	public static void validate(int age) {
		if(age <18) {
			throw new ArithmeticException("Not eligible for vote");
		}
		else
			System.out.println("welcome to vote");
	}
	public static void main(String[] args) {
		validate(20);

	}

}
