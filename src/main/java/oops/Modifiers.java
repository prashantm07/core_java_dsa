package oops;

public class Modifiers {

	private class a {

	}

	public static void main(String[] args) {
		String s = "i am not String";

		char charArray[] = s.toCharArray();

		char output[] = new char[s.length()];

		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == ' ') {
				output[i] = ' ';
			}

		}
		int j = output.length - 1;
		for (int i = 0; i < charArray.length; i++) {

			if (charArray[i] != ' ') {

				if (output[j] == ' ') {
					j--;
				}
				output[j--] = charArray[i];

			}

		}
		String s1 = String.valueOf(output);
		System.out.println(s1);

	}
}
