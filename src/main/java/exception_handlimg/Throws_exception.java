package exception_handlimg;

public class Throws_exception {

	public  int divide(int m, int n) throws ArithmeticException {
		int num = m / n;
		return num;
	}

	public static void main(String[] args) {
		Throws_exception obj = new Throws_exception();
		try {
			System.out.println(obj.divide(500, 0));
			
		} catch (ArithmeticException e) {
 
			System.out.println("number cannot be divide by 0");
		}

	}

}
	