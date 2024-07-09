package string;

public class ReverseEachWord {

	public static void main(String[] args) {
		String s = "l love java";
		String sArray[] = s.split(" ");
		String reverseString = "";
		for (int i = 0; i < sArray.length; i++) {
			String word = sArray[i];
			String reverseWord = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				reverseWord = reverseWord + word.charAt(j);
			}
			reverseString = reverseString + reverseWord + " ";
		}
		System.out.println(reverseString);
	}

}
