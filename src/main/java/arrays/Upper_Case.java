package arrays;

public class Upper_Case {

	public static void main(String[] args) {
		String s = "prashant";
		String s1 = s.toUpperCase();
		System.out.println(s1);

		char ch[] = s.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= 'a' && ch[i] <= 'z') {

				ch[i] = (char) (ch[i] + ('A' - 'a'));

			}
		}
		System.out.println(ch);

	}

}
