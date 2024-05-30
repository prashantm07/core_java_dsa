package string;

public class ReverseWord {
	public static void main(String[] args) {
		String s = "I Love Java";

		String[] word = s.split(" ");
		String reverse = "";
		for (int i = word.length-1; i >= 0; i--) {
			reverse += word[i]+" ";
		}
//		reverse = reverse.trim();
		System.out.println(reverse);
	}
}
