package exception_handlimg;

public class TryCatch {
public static void main(String[] args) {
	int result = 0;
	try {
		int n = 10;
		result = n/0;
	}
	catch (ArithmeticException e) {
		System.out.println(e.getMessage());
	}
	catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println(result);
}
}
