package string;

public class NonRepeatingChar {
	public String nonRepeatChar(String str) {
		char StringArray[] = str.toLowerCase().toCharArray();
		String output = "";
		for (int i = 0; i < StringArray.length; i++) {
			int count = 0;
			for (int j = 0; j < StringArray.length; j++) {
				if (StringArray[i] == StringArray[j]) {
					count++;
				}
			}
			if(count == 1) {
				output += StringArray[i]; 
			}

		}
		return output;
	}

	public static void main(String[] args) {
		NonRepeatingChar nonRepeatingChar = new NonRepeatingChar();
		String s = "prashant";
		System.out.println(nonRepeatingChar.nonRepeatChar(s));

	}

}
