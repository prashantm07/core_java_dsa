package practice;

public class DemoClass {
	public static void main(String[] args) {
		String a = "Prashant";
		String b = "Mane";
		System.out.println("A : " + a + "\nB : " + b);
		System.out.println(" ----Swapping String----- ");

//		Without Using 3rd variable
		a = a + b; //PrashantMane
		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length());

////		 Using 3rd variable
//		String temp = a;
//		a = b;
//		b = temp;

		System.out.println("A : " + a + "\nB : " + b);
	}

}
