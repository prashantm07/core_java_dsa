package string;

public class ReserseStringPreservinfSpace {

	public static void main(String[] args) {
		String str = "prashant mane";

//		convert input string to char array
		char[] inputStringArray = str.toCharArray();

//		create new char array with same length of input arry
		char[] resultArry = new char[inputStringArray.length];

//		insert space to new char array

		for (int i = 0; i < inputStringArray.length; i++) {
			if (inputStringArray[i] == ' ') {
				resultArry[i] = ' ';
			}
		}
//  	initialization j with length of resultArry
		int j = resultArry.length - 1;

//		copy every non space character of inputArry
		for (int i = 0; i < inputStringArray.length; i++) {
			if (inputStringArray[i] != ' ') {

				if (resultArry[j] == ' ') {
					j--;
				}
				resultArry[j--] = inputStringArray[i];
//				j--;
			}

		}
		System.out.println(str + " ---> " + String.valueOf(resultArry));

	}

}
