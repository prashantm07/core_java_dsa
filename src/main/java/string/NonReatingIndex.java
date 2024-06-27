package string;

public class NonReatingIndex {

	public void findIndex(String s) {
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int count = 0;
			
			for (int j = 0; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(i);
				break;
			}
		}
	}

	public static void main(String[] args) {
		String s = "abcdcaf";
		NonReatingIndex nri = new NonReatingIndex();
		nri.findIndex(s);

	}

}
