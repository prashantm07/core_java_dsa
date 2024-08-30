package demo;

public class MyClass {
	public static boolean isPower(int n) {
		boolean a = n > 0 && (n & (n - 1)) == 0;
		System.out.println(a);
		return true;
	}

	public String sayHelloFromNewClass() {
		String s = "TEST";
		String output = "";
		char ch[] = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int count = 0;
			for (int j = 0; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
				}
			}
			if (count == 1) {
				output += ch[i];
				// System.out.print(ch[i]+" ");
			}
		}
		return output;
	}

	public static void main(String[] args) {
		int number = 16;
		MyClass class1 = new MyClass();
		String s = class1.sayHelloFromNewClass();
		System.out.println(s);
		isPower(number);

	}

}
