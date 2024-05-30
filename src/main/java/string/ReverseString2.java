package string;

public class ReverseString2 {
	public static void main(String[] args) {
		String s = "javaa";
		char[] a = s.toCharArray();
		int left = 0;
		int right = a.length - 1;
		if (!s.isEmpty()) {
			while (right > left) {
				char temp = a[left];
				a[left++] = a[right];
				a[right--] = temp;
			}
			String s1 = new String(a);
			System.out.println(s1);
		} else {
			System.out.println("String is Empty......!!");
		}

	}
}
