package string;

public class CountVowelsConsonants {

	public static void main(String[] args) {
		String s = "hello12 java";
		int vowel = 0;
		int consonants = 0;
		int digit = 0;
		s = s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (Character.isLetter(ch)) {

				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowel++;
				} else {
					consonants++;
				}
			} else if (ch != ' ') {
				digit++;
			}
		}
		System.out.println("Vowel Count : " + vowel);
		System.out.println("consonants Count : " + consonants);
		System.out.println("Digit Count : " + digit);

	}

}
