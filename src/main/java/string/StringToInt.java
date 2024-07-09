package string;

public class StringToInt {

	public static void main(String[] args) {
		String s  = "1234";
		int number = Integer.parseInt(s); //String to Number
		int number1 = Integer.valueOf(s); //String to Number
		
		int n = 1234;
		String n1 = Integer.toString(n); // number to string
		String n2 = String.valueOf(n); // number to string
	} 
}
