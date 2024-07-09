package string;

public class reverseString {
	public static void main(String[] args) {
		String s = "how are you today?";
		char sArray[] = s.toCharArray();
		for (int i = sArray.length - 1; i >= 0; i--) {

			System.out.print(sArray[i]);
			
			
		}
		System.out.println();
		StringBuffer reverseString = new StringBuffer(s);
		reverseString.reverse();
		System.out.println(reverseString);
		
	}
}
// Input : Prasahnt
//  OutPut : tnahsarP


