package arrays;

public class Replace_char {

	public static void main(String[] args) {

		String s = "prashat";
		char ch [] = s.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			if(ch[i] == 'a') {
				ch[i] = 'A';
			}
			
		}
		System.out.println(String.valueOf(ch));
		
	}

}
