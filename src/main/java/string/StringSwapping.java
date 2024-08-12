package string;

public class StringSwapping {
	public static void main(String[] args) {
		String a = "Prashant";
		String b = "Mane";

//		/Without Using 3rd variable
		a = a + b; // PrashantMane
		b = a.substring(0, a.length() - b.length()); // Mane --> Prashant
		a = a.substring(b.length()); // Prashant --> Mane
		System.out.println("a : " + a + " \n" + "b : " + b);
		
//		Using third variable
		String temp = a ;
		a = b;
		b = temp;
	}

}
