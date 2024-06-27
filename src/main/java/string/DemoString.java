package string;

public class DemoString {
	public static void main(String[] args) {
		String s1 = "asd";
		String s2 = "asd";
		String s3 = new String("asd");		
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));
		
		final int n =10;
//		n=20;
		System.out.println(n);
	}

}
