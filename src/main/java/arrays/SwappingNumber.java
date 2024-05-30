package arrays;

public class SwappingNumber {

	public static void main(String[] args) {
		int a = 30;
		int b = 47;

//		a = a + b;
//		b = a - b;
//		a = a - b;

		
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("value of a is : " + a);
		System.out.println("value of b is : " + b);
	}

}
