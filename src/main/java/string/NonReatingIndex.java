package string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NonReatingIndex {

	public void findIndex(String s) {
		char ch[] = s.toCharArray();
		List<Character> uniqueChar = new ArrayList<Character>();
		
		Set<Character> set = new HashSet<Character>();
		
		for (int i = 0; i < ch.length; i++) {
			if(set.contains(ch[i])) {
				set.add(ch[i]);
			}
			
		}
		System.out.println(set);
//		[c, d, k, j, g, h]	
//		for (int i = 0; i < ch.length; i++) {
//			int count = 0;
//			for (int j = 0; j < ch.length; j++) {
//				if (ch[i] == ch[j]) {
//					count++;
//				}
//			}
//			if (count == 1) {
//				uniqueChar.add(ch[i]);
////				System.out.print(ch[i]+" ");
////				break;
//			}
//		}
//		System.out.println(uniqueChar);
	}

	public static void main(String[] args) {
		String s = "abcdabkjgh";
		NonReatingIndex nri = new NonReatingIndex();
		nri.findIndex(s);

	}

}
