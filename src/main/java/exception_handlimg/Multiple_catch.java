package exception_handlimg;

public class Multiple_catch {

	public static void main(String[] args) {
		try {
			int[] a = new int[5];
//			System.out.println(a[10]);
//			a[5] = 30 / 0;
//			String s = null;
//			System.out.println(s.length());
			int data = 50/5;
			System.out.println(data);
			System.exit(0); // finally block deos not execute
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Index Out Of Bounds Exception");
		} catch (Exception e) {
			System.out.println("parent exception ");
		} finally {
			System.out.println("block used to execute important code such as closing the connection");
		}

	}

}
