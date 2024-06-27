package string;

import java.util.HashSet;
import java.util.Set;

public class duplicate_element {

	public static void main(String[] args) {
		String s = "abcdeab";
		Set<Character> set = new HashSet<Character>();
		char ch [] = s.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			int count = 0;
			for (int j = 0; j < ch.length; j++) {
				if(ch[i] == ch[j]) {
					count++;
				}
			}
			if(count == 2) {
			set.add(ch[i]);
			}
		}
		System.out.println(set);
	}
}
