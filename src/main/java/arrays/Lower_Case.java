package arrays;

public class Lower_Case {

	public static void main(String[] args) {
		String s = "PRASHANT";
		String s1 = s.toLowerCase();
		System.out.println(s1);

		char ch[] = s.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'A' && ch[i] <= 'Z') {

				ch[i] = (char) (ch[i] + ('a' - 'A'));

			}
		}
		System.out.println(ch);

	}

}
